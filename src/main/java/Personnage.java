import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Personnage {
    public String nom;
    public int solde;
    public Case position;
    public List<Propriete> mesProprietes = new ArrayList<Propriete>();
    private int lastDes;

    public Personnage(String nom, Case position) {
        this.nom = nom;
        this.solde = 1300;
        this.position = position;
    }

    public void setPosition(Case caseCible) {
        this.position = caseCible;
    }

    public void aToiDeJouer(LesDes des) {
        System.out.println("\nTour de : " + nom + ", solde actuel : " + solde + "€");
        des.lancerDes();
        int resDes = des.getTotalDes();
        System.out.println(nom + " : Lancement des dés : " + resDes);

        // On avance
        setPosition(position.avancer(this, resDes));

        position.joueurArrive(this);


    }

    public boolean proposerAchat(float prix) {
        System.out.println("Souhaitez vous acheter cette rue ? ");
        System.out.println("1 - Oui ");
        System.out.println("2 - Non ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str.equals("1");
    }

    public boolean payerLoyer(int montant) {
        System.out.println("payerLoyer Perso : return false par défaut");
        return false;
    }

    public boolean estProprietaire(Propriete caseCible) {
        return this.equals(caseCible.proprietaire);
    }

    public boolean debiterSolde(int montant) {
        if ((solde - montant) >= 0) {
            solde -= montant;
            System.out.println(nom + " a été débité de " + montant + "€");
            System.out.println(nom + " nouveau solde : " + solde + "€");
            return true;
        }
        return false;
    }

    public boolean créditerSolde(int montantLoyer) {
        solde += montantLoyer;
        return true;
    }

    public int lancerDes(LesDes lesDes) {
        lesDes.lancerDes();
        return lesDes.getTotalDes();
    }

    public int nbGaresPossedees() {
        System.out.println("nbGaresPossedees Perso : return 0 par défaut");
        return 0;
    }

    public boolean soldeSuffisant(int p1) {
        return (solde - p1) >= 0;
    }

    public boolean demandeConstruction(int prix) {
        System.out.println("Souhaitez vous achetez des maisons pour le prix de : " + prix + "€");
        System.out.println("1 - Oui");
        System.out.println("2 - Non");
        Scanner sc = new Scanner(System.in);
        String rep = sc.nextLine();
        return Objects.equals(rep, "1");
    }

    // Getter - Setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Stream

    public void afficheChoix() {
        System.out.println("1 - Acheter Terrain ");
        System.out.println("2 - Construire maison ");
        System.out.println("3 - Fin du tours ");
    }

    public void addPropriete(Propriete rue) {
        mesProprietes.add(rue);
    }
}
