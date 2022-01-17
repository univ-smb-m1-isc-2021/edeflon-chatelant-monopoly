import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCaseDepart {
    @Test
    void test() {
        Case depart = new CaseDepart();
        Case c1 = new CaseChance();
        Case c2 = new CaisseCommu();

        depart.setSuivant(c1);
        c1.setSuivant(c2);
        c2.setSuivant(depart);

        Personnage p = new Personnage("Willy", c2);

        // Le joueur gagne 200 en passant par la case départ
        int soldeInitial = p.solde;
        p.setPosition(p.position.avancer(p, 2));
        int soldeFinal = p.solde;

        Assertions.assertEquals((soldeFinal - soldeInitial), 200);

        // Le joueur gagne 400 en tombant sur la case départ
        soldeInitial = p.solde;
        p.setPosition(p.position.avancer(p, 2));
        p.setPosition(p.position.avancer(p, 1));
        soldeFinal = p.solde;

        Assertions.assertEquals((soldeFinal - soldeInitial), 400);
    }
}
