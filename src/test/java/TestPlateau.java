import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPlateau {
    @Test
    void test() {
        Plateau p = new Plateau();
        // Test case départ
        Assertions.assertNotNull(p.getCaseDepart());

        // Test nb cases
        int nbCases = 0;
        Case cc = p.caseDepart.caseSuivante;
        while (cc != p.caseDepart) {
            cc = cc.caseSuivante;
            nbCases++;
        }
        Assertions.assertEquals(39, nbCases);
    }
}
