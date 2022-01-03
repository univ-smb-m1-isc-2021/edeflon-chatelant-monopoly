public class Gare extends Propriete {

    public Gare(String nom) {
        this.nom = nom;
        this.prixAchat = 200;
    }

    //TODO
    public int calculLoyer() {
        System.out.println("calculLoyer Gare : return 0 par défaut");
        return 0;
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }
}
