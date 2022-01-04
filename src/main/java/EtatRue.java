public abstract class EtatRue {

    public abstract void joueurArrive(Personnage personne);

    public void avancer(int nbCases) {
    }

    public boolean verifQuartier() {
        System.out.println("verifQuartier : return false par défaut");
        return false;
    }

    public void prixConstruction() {
    }

    public void addMaison() {

    }

}
