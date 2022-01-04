public class RueOccupe extends EtatRue {
    private Rue rue;

    public RueOccupe(Rue rue) {
        this.rue = rue;
    }

    @Override
    public void joueurArrive(Personnage personne) {
        System.out.println("Rue Occupe : Joueur Arrive");
        // Si la personne n'est pas propriétaire
        if (!personne.equals(rue.getProprietaire())){
            personne.debiterSolde(rue.calculLoyer());
            rue.getProprietaire().créditerSolde(rue.calculLoyer());
        }
    }
}
