import java.util.List;

public class Gare extends Propriete {

    private List<Gare> gares;

    public Gare(String nom) {
        this.nom = nom;
        this.prixAchat = 200;
    }

    public int calculLoyer() {
        int nbGaresPossedees = this.memeProprietaire();
        if (nbGaresPossedees == 1) {
            return 25;
        } else if (nbGaresPossedees == 2) {
            return 50;
        } else if (nbGaresPossedees == 3) {
            return 100;
        } else {
            return 200;
        }
    }

    public void setGares(List<Gare> Lgares) {
        this.gares = Lgares;
    }

    public int memeProprietaire() {
        int res = 0;
        for (Gare gare : gares) {
            if (this.proprietaire.equals(gare.proprietaire)) {
                res += 1;
            }
        }
        return res;
    }

    public void setProprietaire(Personnage p) {
        proprietaire = p;
    }

    @Override
    public void joueurArrive(Personnage perso) {
        // Si le terrain n'est pas acheté et le joueur a assez d'argent
        if (proprietaire == null && perso.soldeSuffisant(prixAchat)) {
            // Proposer achat, si le joueur achete
            if (perso.proposerAchat(prixAchat)) {
                proprietaire = perso;
                perso.addPropriete(this);
            }
            // Sinon si le perso n'est pas le propriétaire
        } else if (!proprietaire.equals(perso)) {
            int loyer = calculLoyer();
            perso.debiterSolde(loyer);
            proprietaire.créditerSolde(loyer);
        }
        // Sinon on ne fait rien
    }
}
