
public class RueConstructible extends EtatRue {
    private Rue rue;

    public RueConstructible(Rue rue) {
        this.rue = rue;
    }

    @Override
    public void joueurArrive(Personnage personne) {
        // Si la personne est le propriétaire et qu'il à l'argent nécéssaire à la construction
        if (personne.equals(rue.getProprietaire()) && personne.soldeSuffisant(rue.prixConstruction())) {
            if (personne.demandeConstruction(rue.prixConstruction())) {
                rue.getQuartier().addMaison();
            }
        } else if (!personne.equals(rue.getProprietaire())) {
            personne.debiterSolde(rue.calculLoyer());
        }
    }

}
