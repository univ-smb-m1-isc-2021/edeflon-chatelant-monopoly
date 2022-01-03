import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monopoly {
    // Attributs
    private LesDes lesDes;
    private List<Personnage> joueurs = new ArrayList<Personnage>();
    private Plateau plateau;
    private Personnage joueurCourant;

    // Constructeur
    public Monopoly() {
        this.lesDes = new LesDes();
        this.plateau = new Plateau();
        lancerPartie();
    }

    // ----- Methodes ----- //

    // Gère le lancement de la partie
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        // Recuperation du nb joueurs
        System.out.println("Veuillez saisir le nombre de joueurs :");
        int nbJ = Integer.parseInt(sc.nextLine());

        // Recuperation des noms des joueurs
        for (int i = 0; i < nbJ; i++) {
            System.out.println("Entrez le nom du joueur" + (i + 1));
            joueurs.add(new Personnage(sc.nextLine(), plateau.getCaseDepart()));
        }
        // Affichage récap
        System.out.println("Liste des joueurs : ");
        for (int i = 0; i < nbJ; i++) {
            System.out.println(joueurs.get(i).getNom());
        }
        System.out.println("\n");
        setJoueurCourant();

        joueurCourant.aToiDeJouer(lesDes);
    }

    // Ne sert pas
    public void setTourDeJeu() {
        System.out.println("setTourDeJeu");
    }

    // Met le premier joueur de la liste en joueur courant
    public void setJoueurCourant() {
        this.joueurCourant = joueurs.get(0);
    }

    //Ne sert finalemement pas
    public void creerJoueur(int nbj) {
        System.out.println("creerJoueur");
    }

    // ----- Main ----- //
    public static void main(String[] args) {
        Monopoly jeu = new Monopoly();
    }
}
