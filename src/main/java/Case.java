public abstract class Case {
    String nom;
    public Case caseSuivante;

    public Case avancer(Personnage p, int nbCases) {
        if (nbCases == 0) {
            System.out.println("Case d'arrivée : " + this.nom);
            return this;
        } else {
            return caseSuivante.avancer(p, nbCases - 1);
        }
    }

    public abstract void joueurArrive(Personnage perso);

    // Pour création des cases
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }
}
