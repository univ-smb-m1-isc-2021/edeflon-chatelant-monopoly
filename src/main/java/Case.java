public abstract class Case {
    public Case caseSuivante;

    public Case avancer(int nbCases) {
        System.out.println("Case, méthode avancer : return caseSuivante par défaut");
        return caseSuivante;
    }

    public void joueurArrive(Personnage perso) {
    }

}
