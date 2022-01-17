import org.junit.jupiter.api.Test;

public class TestService {

    @Test
    public void test() {
        CaseDepart caseDepart = new CaseDepart();
        Service service = new Service("Service", 100);
        Service other = new Service("Autre", 100);
        service.setOtherService(other);
        other.setOtherService(service);

        Personnage p1 = new Personnage("Remi", caseDepart);
        Personnage p2 = new Personnage("Lucy", caseDepart);

        // Service, mode "RueLibre"
        assert(service.proprietaire == null);

        // Service acheté
        p1.setPosition(service);
        p1.addPropriete(service);
        service.setProprietaire(p1);

        assert(service.proprietaire.equals(p1));
        assert(p1.mesProprietes.contains(service));

        // Service acheté par un autre, loyer à payer
        int soldeP2depart = p2.solde;
        p2.setPosition(service);
        service.joueurArrive(p2);
        int soldeP2arrive = p2.solde;

        assert(soldeP2depart > soldeP2arrive);

        // Vérifie le montant du loyer (1 service possédé)
        int loyer = soldeP2depart - soldeP2arrive;

        assert( (2 <= (loyer/4)) && ((loyer/4) <= 12));

        // Vérifie le montant du loyer (2 services possédés)
        p1.setPosition(other);
        p1.addPropriete(other);
        other.setProprietaire(p1);

        soldeP2depart = p2.solde;
        p2.setPosition(other);
        other.joueurArrive(p2);

        loyer = soldeP2depart - p2.solde;

        assert( (2 <= (loyer/10)) && ((loyer/10) <= 12) );
    }
}
