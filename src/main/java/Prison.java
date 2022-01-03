public class Prison extends Case {

    public Prison() {
        this.nom = "Prison";
    }

    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println("Case prison : Quelle chance, elle n'est pas implémenté !");
    }

}
