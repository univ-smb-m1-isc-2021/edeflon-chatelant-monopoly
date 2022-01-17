import org.junit.jupiter.api.Test;

public class TestPlateau {
    @Test
    public void test() {
        Plateau p = new Plateau();
        // Test case départ
        assert (p.getCaseDepart() != null);

        // Test nb cases
        int nbCases = 0;
        Case cc = p.caseDepart.caseSuivante;
        while(cc != p.caseDepart){
            cc = cc.caseSuivante;
            nbCases++;
        }
        assert ( nbCases == 39);
    }
}
