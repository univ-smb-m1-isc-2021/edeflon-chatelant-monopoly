import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestScenars {

    // Attributs
    private LesDes lesDes;
    private static List<Personnage> joueurs = new ArrayList<Personnage>();
    private Plateau plateau;
    private static Personnage joueurCourant;

    // Constructeur
    public TestScenars() {
        this.lesDes = new LesDes();
        this.plateau = new Plateau();
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

    public static void incr11() {
        System.out.println("~ Incrément 1.1\n");
        TestScenars jeu = new TestScenars();
        jeu.lancerPartie();
        System.out.println(joueurCourant.nom + " commence la partie.");
    }

    public static void incr12() {
        System.out.println("\n~ Incrément 1.2\n");
        int resDes = 6;
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        System.out.println(joueurCourant.nom + " : Lancement des dés : " + resDes);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 6));
        joueurCourant.position.joueurArrive(joueurCourant);
        // Paul achète le terrain
        // Paul veut acheter une maison mais ne peut pas.
    }

    public static void incr21() {
        // INCR2.1
        System.out.println("\n~ Incrément 2.1\n");
        joueurCourant = joueurs.get(1);
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 2));
        joueurCourant.position.joueurArrive(joueurCourant);
    }

    public static void incr22() {
        System.out.println("\n~ Incrément 2.2\n");
        joueurCourant = joueurs.get(2);
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 11));
        joueurCourant.position.joueurArrive(joueurCourant);
    }

    public static void incr23() {
        System.out.println("\n~ Incrément 2.3\n");
        joueurCourant = joueurs.get(0);
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 23));
        joueurCourant.position.joueurArrive(joueurCourant);
    }

    public static void incr24() {
        System.out.println("\n~ Incrément 2.4\n");
        joueurCourant = joueurs.get(1);
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 6));
        System.out.println(joueurCourant.nom + " passe par la case Départ, il gagne 200€, nouveau solde : " + joueurCourant.solde + "€");
        joueurCourant.position.joueurArrive(joueurCourant);
        System.out.println("--- quelques tours plus tard ---");
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 34));
        joueurCourant.position.joueurArrive(joueurCourant);
    }

    public static void incr25() {
        System.out.println("\n~ Incrément 2.5\n");
        joueurCourant = joueurs.get(2);
        System.out.println("Tour de : " + joueurCourant.nom + ", solde actuel : " + joueurCourant.solde + "€");
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 40));
        joueurCourant.position.joueurArrive(joueurCourant);
    }

    public static void voleRue(Personnage joueur, Rue prop) {
        joueur.addPropriete(prop);  // Ajout dans la liste des prop du joueur
        prop.setProprietaire(joueur); // Ajout du joueur en tant que proprietaire sur la case
        prop.setEtat(new RueOccupe(prop)); // Met l'etat de la rue a occupe
        // Passe les rues du quartier a constructibles si toutes possedes par le meme proprio
        if (prop.verifQuartier()) {
            prop.setQuartierConstructible();
        }
    }

    public static void voleGare(Personnage joueur, Gare gare) {
        joueur.addPropriete(gare);
        gare.setProprietaire(joueur);
    }

    public static void voleService(Personnage joueur, Service service) {
        joueur.addPropriete(service);
        service.setProprietaire(joueur);
    }

    public static void main(String[] args) {
        System.out.println("~~~ Lancement du Test ~~~\n");

        // INCR1.1
        incr11();

        // INCR1.2
        incr12();

        // INTERLUDE
        System.out.println("\nINTERLUDE");
        joueurCourant.créditerSolde(3000);

        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 9)); // Gare de Lyon
        voleGare(joueurCourant, (Gare) joueurCourant.position);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 10)); // Gare du Nord
        voleGare(joueurCourant, (Gare) joueurCourant.position);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 20)); // Gare de Montparnasse
        voleGare(joueurCourant, (Gare) joueurCourant.position);

        joueurCourant = joueurs.get(1);
        joueurCourant.créditerSolde(3000);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 31)); // Case verte 1
        voleRue(joueurCourant, (Rue) joueurCourant.position);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 1)); // Case verte 2
        voleRue(joueurCourant, (Rue) joueurCourant.position);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 2)); // Case verte 3
        voleRue(joueurCourant, (Rue) joueurCourant.position);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 3)); // Avenue des champs Elysées
        voleRue(joueurCourant, (Rue) joueurCourant.position);
        joueurCourant.debiterSolde(3710);

        joueurCourant = joueurs.get(2);
        joueurCourant.créditerSolde(3000);
        joueurCourant.setPosition(joueurCourant.position.avancer(joueurCourant, 28)); // eaux
        voleService(joueurCourant, (Service) joueurCourant.position);
        joueurCourant.debiterSolde(4000);

        System.out.println("\n--- la partie progresse ---");
        System.out.println("Entre temps, les joueurs ont acheté les cases suivantes : ");
        System.out.println("- " + joueurs.get(0).nom + ": Gare Montparnasse, Gare de Lyon, Gare du Nord");
        System.out.println("- " + joueurs.get(1).nom + ": Avenue des champs Elysees, les 3 cases du quartier vert");
        System.out.println("- " + joueurs.get(2).nom + " : Service des eaux");
        System.out.println("--- c'est au tour de Luc de jouer ---\n");

        // INCR2.1
        incr21();

        // INCR2.2
        incr22();

        // INCR2.3
        incr23();

        // INCR2.4
        incr24();

        // INCR2.5
        incr25();

        System.out.println("\n~~~ Fin du Test ~~~");
    }

    // Méthode test appelée lors du build
    @Test
    public void methTest(){
        assert(true);
    }
}
