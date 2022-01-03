public class Taxes extends Case {
    int prix;

    public Taxes(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public Case avancer(int nbCases) {
        return super.avancer(nbCases);
    }

    //TODO
    @Override
    public void joueurArrive(Personnage perso) {
        super.joueurArrive(perso);
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }
}
