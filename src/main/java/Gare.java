import java.util.List;

public class Gare extends Propriete {

    private List<Gare> gares;

    public Gare(String nom) {
        this.nom = nom;
        this.prixAchat = 200;
    }

    public int calculLoyer() {
        int nbGaresPossedees = this.memeProprietaire();
        return 50 * nbGaresPossedees;
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

    // TODO ajouter les gares à la liste
    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println(perso.nom + "sur la case " + this.nom + ".");
    }
}
