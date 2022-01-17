import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGare {

    @Test
    void test() {
        Gare g1 = new Gare("1");
        Gare g2 = new Gare("2");
        Gare g3 = new Gare("3");
        Gare g4 = new Gare("4");

        List<Gare> lg = new ArrayList<>();
        lg.add(g1);
        lg.add(g2);
        lg.add(g3);
        lg.add(g4);

        g1.setGares(lg);
        g2.setGares(lg);
        g3.setGares(lg);
        g4.setGares(lg);

        Personnage p1 = new Personnage("Bob", g4);
        Personnage p2 = new Personnage("Bill", g4);

        // Gare libre
        Assertions.assertNull(g1.proprietaire);

        // Achat Gare
        p1.setPosition(g1);
        p1.addPropriete(g1);
        g1.setProprietaire(p1);

        Assertions.assertEquals(p1, g1.proprietaire);
        Assertions.assertTrue(p1.mesProprietes.contains(g1));

        // Loyer 1 gare
        int soldeP2depart = p2.solde;
        p2.setPosition(g1);
        g1.joueurArrive(p2);
        int soldeP2arrive = p2.solde;

        Assertions.assertTrue(soldeP2depart > soldeP2arrive);
        Assertions.assertEquals(25,soldeP2depart - soldeP2arrive);

        // Loyer 2 gares
        p1.setPosition(g2);
        p1.addPropriete(g2);
        g2.setProprietaire(p1);

        soldeP2depart = p2.solde;
        p2.setPosition(g2);
        g2.joueurArrive(p2);
        soldeP2arrive = p2.solde;

        Assertions.assertTrue(soldeP2depart > soldeP2arrive);
        Assertions.assertEquals(50, soldeP2depart - soldeP2arrive);

        // Loyer 3 gares
        p1.setPosition(g3);
        p1.addPropriete(g3);
        g3.setProprietaire(p1);

        soldeP2depart = p2.solde;
        p2.setPosition(g3);
        g3.joueurArrive(p2);
        soldeP2arrive = p2.solde;

        Assertions.assertTrue(soldeP2depart > soldeP2arrive);
        Assertions.assertEquals(100,soldeP2depart - soldeP2arrive);

        // Loyer 4 gares
        p1.setPosition(g4);
        p1.addPropriete(g4);
        g4.setProprietaire(p1);

        soldeP2depart = p2.solde;
        p2.setPosition(g4);
        g4.joueurArrive(p2);
        soldeP2arrive = p2.solde;

        Assertions.assertTrue(soldeP2depart > soldeP2arrive);
        Assertions.assertEquals(200,soldeP2depart - soldeP2arrive);

    }
}
