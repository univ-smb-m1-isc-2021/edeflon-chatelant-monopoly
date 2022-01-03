public class ParcGratuit extends Case {

    public ParcGratuit() {
        this.nom = "Parc Gratuit";
    }

    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println("Parc gratuit : rien ne se passe.");
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }
}
