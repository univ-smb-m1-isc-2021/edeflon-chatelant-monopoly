import java.util.ArrayList;
import java.util.List;

public class Quartier {
    // Attributs
    public List<Rue> rue = new ArrayList<Rue>();

    public Quartier(List<Rue> rue) {
        this.rue = rue;
    }

    // Methodes
    //TODO
    public boolean verifQuartierComplet(Personnage personne) {
        return true;
    }

    //TODO
    public void addMaison() {
        System.out.println("addMaison");
    }

    @Override
    public String toString() {
        for (int i = 0; i < rue.size(); i++) {
            System.out.println(rue.get(i).nom);
        }
        System.out.println("---");
        return rue.toString();
    }
}
