public class Rue extends Propriete {
    // Arguments
    private int nbMaisons;
    private final int prixAchat;
    private final int loyer;
    private final int loyer1M;
    private final int loyer2M;
    private final int loyer3M;
    private final int loyer4M;
    private final int loyerH;
    private EtatRue etatRue;
    private Quartier quartier;


    public Rue(String nom, int prixAchat, int loyer, int loyer1M, int loyer2M, int loyer3M, int loyer4M, int loyerH) {
        this.nom = nom;
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

    //TODO
    public boolean verifQuartier() {
        return true;
    }

    //TODO
    public int prixConstruction() {
        return 0;
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

    @Override
    public int calculLoyer() {
        if (nbMaisons == 0) {
            return loyer;
        } else if (nbMaisons == 1) {
            return loyer1M;
        } else if (nbMaisons == 2) {
            return loyer2M;
        } else if (nbMaisons == 3) {
            return loyer3M;
        } else if (nbMaisons == 4) {
            return loyer4M;
        } else {
            return loyerH;
        }
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }

    public void setQuartier(Quartier newQuartier) { this.quartier = newQuartier; }
}
