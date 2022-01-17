public class CaseDepart extends Case {

    public CaseDepart() {
        this.nom = "Case Départ";
    }

    @Override
    public Case avancer(Personnage p, int nbCases) {
        p.crediterSolde(200);
        return super.avancer(p, nbCases);
    }

    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println(perso.nom + " sur la case " + this.nom + ".");
        perso.crediterSolde(200);
    }
}
