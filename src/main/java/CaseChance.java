public class CaseChance extends Case {
    public CaseChance() {
        this.nom = "Case Chance";
    }

    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println("Case Chance : cartes non implémentés");
    }
}
