import java.util.ArrayList;
import java.util.List;


public class Monopoly {
    // Attributs
    public LesDes lesDés;
    public List<Personnage> joueurs = new ArrayList<Personnage>();
    public Plateau plateau;

    // Constructeur
    public Monopoly() {
        System.out.println("Constructeur Monop");
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

    public static void main() {
        System.out.println("Hello world");
//        Monopoly jeu;
    }
}
