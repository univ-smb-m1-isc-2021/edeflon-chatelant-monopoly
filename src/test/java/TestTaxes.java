import org.junit.jupiter.api.Test;

public class TestTaxes {
    @Test
    public void test() {
        // Initialisation
        Case cTest = new Taxes("Taxes test", 100);
        Personnage p = new Personnage("JoueurTest", null);
        int soldeDepart = p.solde;

        // Arrivé sur la case Taxe
        p.setPosition(cTest);
        cTest.joueurArrive(p);
        int soldeArrive = p.solde;

        assert (soldeArrive < soldeDepart);
    }
}
