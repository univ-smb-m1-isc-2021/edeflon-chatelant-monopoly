import org.junit.jupiter.api.Test;

public class TestService {

    @Test
    public void test() {
        Plateau p = new Plateau();
        Service service = new Service("Service", 100);

        Personnage p1 = new Personnage("Remi", p.caseDepart);
        Personnage p2 = new Personnage("Lucy", p.caseDepart);

        // Service, mode "libre"
        assert(service.proprietaire == null);

        // Service acheté
        p1.setPosition(service);
        p1.addPropriete(service);
        service.setProprietaire(p1);

        assert(service.proprietaire == p1);

        // Service acheté par un autre, loyer à payer
        int soldeP2depart = p2.solde;
        p2.setPosition(service);
        service.joueurArrive(p2);

        assert(soldeP2depart < p2.solde);

        // Vérifie le montant du loyer (1 service possédé)
        int loyer = p2.solde - soldeP2depart;

        assert( 2 <= (loyer/4) && (loyer/4 <= 12));

        // Vérifie le montant du loyre (2 services possédés)
        Service other = new Service("Autre", 100);
        p1.setPosition(other);
        p1.addPropriete(other);
        other.setProprietaire(p1);

        soldeP2depart = p2.solde;
        p2.setPosition(other);
        other.joueurArrive(p2);

        loyer = p2.solde - soldeP2depart;

        assert( (2 <= (loyer/10)) && ((loyer/10) <= 12) );
    }
}
