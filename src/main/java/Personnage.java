import java.util.ArrayList;
import java.util.List;

public class Personnage {
    public int solde;
    public Case position;

    public List<Propriete> mesProprietes = new ArrayList<Propriete> ();

    public void setPosition(Case caseCible) {
    }

    public void aToiDeJouer(LesDes des) {
    }

    public void jouerTour() {
    }

    public void acheter() {
    }

    public void proposerAchat(float prix) {
    }

    public boolean payerLoyer(int montant) {
        System.out.println("payerLoyer Perso : return false par défaut");
        return false;
    }

    public boolean estProprietaire(Propriete caseCible) {
        System.out.println("estProprietaire Perso : return false par défaut");
        return false;
    }

    public boolean debiterSolde(int montant) {
        System.out.println("debiterSolde Perso : return false par défaut");
        return false;
    }

    public boolean créditerSolde(int montantLoyer) {
        System.out.println("crediterSolde Perso : return false par défaut");
        return false;
    }

    public int lancerDes() {
        System.out.println("lancerDes Perso : return 0 par défaut");
        return 0;
    }

    public int nbGaresPossedees() {
        System.out.println("nbGaresPossedees Perso : return 0 par défaut");
        return 0;
    }

    public int soldeSuffisant(int p1) {
        System.out.println("soldeSuffisant Perso : return 0 par défaut");
        return 0;
    }

    public boolean demandeConstruction() {
        System.out.println("demandeConstruction Perso : return false par défaut");
        return false;
    }

}
