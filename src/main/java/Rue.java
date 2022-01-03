public class Rue extends Propriete {
    // Arguments
    public int nbMaisons;
    public EtatRue etatRue;
    public Quartier quartier;

    // Methodes
    public boolean verifQuartier() {
        return true;
    }

    public int prixConstruction() {
        return 0;
    }

    public int getMaisons() {
        return 0;
    }

    @Override
    public int calculLoyer() {
        return 0;
    }
}
