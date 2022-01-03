import java.util.ArrayList;
import java.util.List;


public class Monopoly {
    // Attributs
    public LesDes lesDes;
    public List<Personnage> joueurs = new ArrayList<Personnage>();
    public Plateau plateau;

    // Constructeur
    public Monopoly() {
        this.lesDes = new LesDes();
        this.plateau = new Plateau();
        System.out.println("Construction Monopoly");
    }

    // Methodes
    public void lancerPartie(int nbj) {
        System.out.println("lancerPartie");
    }

    public void setTourDeJeu() {
        System.out.println("setTourDeJeu");
    }

    public void setJoueurCourant() {
        System.out.println("setJoueurCourant");
    }

    public void creerJoueur(int nbj) {
        System.out.println("creerJoueur");
    }

    public static void main(String[] args) {
        Monopoly jeu = new Monopoly();
    }
}
