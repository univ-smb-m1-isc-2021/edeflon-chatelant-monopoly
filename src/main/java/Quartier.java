import java.util.ArrayList;
import java.util.List;

public class Quartier {
    // Attributs
    public List<Rue> rue = new ArrayList<Rue>();
    private int prixMaison;

    public Quartier(List<Rue> rue, int prixMaison) {
        this.rue = rue;
        this.prixMaison = prixMaison;
    }

    // Methodes
    public boolean verifQuartierComplet() {
        Personnage p = rue.get(0).getProprietaire();
        // Return false si le quartier n'est pas possédé par la même personne
        for (int i = 1; i < rue.size(); i++) {
            if (rue.get(i).getProprietaire() == null) {
                return false;
            }
            if (!rue.get(i).getProprietaire().equals(p)) {
                return false;
            }
        }
        return true;
    }

    // Changement des etats des rues, passage à constructible
    public void setQuartierConstructible() {
        for (int i = 0; i < rue.size(); i++) {
            rue.get(i).setEtat(new RueConstructible(rue.get(i)));
        }
    }

    public void addMaison() {
        for (int i = 0; i < rue.size(); i++) {
            rue.get(i).incrNbMaisons();
        }
    }

    public int getPrixMaison() {
        return prixMaison * rue.size();
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
