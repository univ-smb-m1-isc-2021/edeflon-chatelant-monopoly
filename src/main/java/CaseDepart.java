public class CaseDepart extends Case{

    public CaseDepart(){
        this.nom = "Case Départ";
    }

    @Override
    public Case avancer(Personnage p, int nbCases) {
        p.créditerSolde(200);
        return super.avancer(p, nbCases);
    }

    //TODO a vérifier si laisser
    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println(perso.nom + "sur la case " + this.nom + ".");
        perso.créditerSolde(200);
    }
}
