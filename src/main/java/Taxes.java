public class Taxes extends Case {
    int prix;

    public Taxes(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    //TODO
    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println("Case Taxe : Vous payez " + prix + "$");
        perso.debiterSolde(prix);
    }

}
