import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaxes {
    @Test
    void test() {
        // Initialisation
        Taxes cTest = new Taxes("Taxes test", 100);
        Personnage p = new Personnage("JoueurTest", null);
        int soldeDepart = p.solde;

        // Arrivé sur la case Taxe
        p.setPosition(cTest);
        cTest.joueurArrive(p);
        int soldeArrive = p.solde;

        Assertions.assertTrue(soldeArrive < soldeDepart);
    }
}
