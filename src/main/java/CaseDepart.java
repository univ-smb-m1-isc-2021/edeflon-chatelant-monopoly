public class CaseDepart extends Case{

    public CaseDepart(){
        this.nom = "Case Départ";
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
    public void setSuivant(Case caseCible){
        this.caseSuivante = caseCible;
    }
}
