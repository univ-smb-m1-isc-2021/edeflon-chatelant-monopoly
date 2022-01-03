public class Service extends Propriete {

    private Service service;
    private int prix;

    public Service(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    //TODO
    @Override
    public int calculLoyer() {
        return 0;
    }
    // Prix de base * montant dés * 4 (si un seul service)
    // Prix de base * montant dés * 10 (si 2 services)


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
