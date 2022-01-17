public class RueLibre extends EtatRue {
    private Rue rue;

    public RueLibre(Rue rue) {
        this.rue = rue;
    }

    @Override
    public void joueurArrive(Personnage personne) {
        // On regarde si le solde du joueur est suffisant pour acheter et le joueur souhaite acheter le terrain
        if (personne.soldeSuffisant(rue.getPrixAchat()) && personne.proposerAchat()) {
            // Le joueur est débité du solde
            personne.debiterSolde(rue.getPrixAchat());
            // L'etat de la rue passe de Libre à occupé
            rue.setProprietaire(personne);
            personne.addPropriete(rue);
            rue.setEtat(new RueOccupe(rue));
            // Si il possède maintenant toutes les rues du quartier
            if (rue.verifQuartier()) {
                rue.setQuartierConstructible();
                rue.joueurArrive(personne);
            }
        }
    }
}
