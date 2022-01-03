public class CaisseCommu extends Case {

    public CaisseCommu() {
        this.nom = "Caisse Communauté";
    }

    @Override
    public Case avancer(int nbCases) {
        return super.avancer(nbCases);
    }

    @Override
    public void joueurArrive(Personnage perso) {
        super.joueurArrive(perso);
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }
}
