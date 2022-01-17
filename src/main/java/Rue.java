public class Rue extends Propriete {
    // Arguments
//    private Personnage proprietaire;
    private EtatRue etatRue;
    private int prixMaison;
    private Quartier quartier;
    private int nbMaisons;
//    private final int prixAchat;
    private final int loyer;
    private final int loyer1M;
    private final int loyer2M;
    private final int loyer3M;
    private final int loyer4M;
    private final int loyerH;


    public Rue(String nom, int prixAchat, int loyer, int loyer1M, int loyer2M, int loyer3M, int loyer4M, int loyerH) {
        this.nom = nom;
        this.etatRue = new RueLibre(this);
        this.prixAchat = prixAchat;
        this.loyer = loyer;
        this.loyer1M = loyer1M;
        this.loyer2M = loyer2M;
        this.loyer3M = loyer3M;
        this.loyer4M = loyer4M;
        this.loyerH = loyerH;
        this.nbMaisons = 0;
    }

    // Methodes
    public boolean verifQuartier() {
        return quartier.verifQuartierComplet();
    }

    public void addMaison(){quartier.addMaison();}

    public void setQuartierConstructible() {
        quartier.setQuartierConstructible();
    }

    public int getPrixMaison(){return quartier.getPrixMaison();}

    public int getPrixAchat() {
        return prixAchat;
    }

    public int prixConstruction() {
        return quartier.getPrixMaison();
    }

    public int getMaisons() {
        return nbMaisons;
    }

    public int getLoyer() {
        return loyer;
    }

    public int getLoyer1M() {
        return loyer1M;
    }

    public int getLoyer2M() {
        return loyer2M;
    }

    public int getLoyer3M() {
        return loyer3M;
    }

    public int getLoyer4M() {
        return loyer4M;
    }

    public int getLoyerH() {
        return loyerH;
    }

    public Personnage getProprietaire() {
        return proprietaire;
    }

    public Quartier getQuartier(){
        return quartier;
    }

    @Override
    public int calculLoyer() {
        if (nbMaisons == 0) {
            if(verifQuartier()){
                return loyer * 2;
            }
//            System.out.println("--- 0M");
            return loyer;
        } else if (nbMaisons == 1) {
//            System.out.println("--- 1M");
            return loyer1M;
        } else if (nbMaisons == 2) {
//            System.out.println("--- 2M");
            return loyer2M;
        } else if (nbMaisons == 3) {
//            System.out.println("--- 3M");
            return loyer3M;
        } else if (nbMaisons == 4) {
//            System.out.println("--- 4M");
            return loyer4M;
        } else {
//            System.out.println("--- HOTEL");
            return loyerH;
        }
    }

    @Override
    public void joueurArrive(Personnage perso) {
        etatRue.joueurArrive(perso);
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }

    public void setQuartier(Quartier newQuartier) {
        this.quartier = newQuartier;
    }

    public void setEtat(EtatRue e) {
        this.etatRue = e;
    }

    public void incrNbMaisons() {
        this.nbMaisons++;
    }

    public void setProprietaire(Personnage personne) {
        this.proprietaire = personne;
    }
}
