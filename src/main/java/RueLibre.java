public class RueLibre extends EtatRue {
    private Rue rue;

    public RueLibre(Rue rue) {
        this.rue = rue;
    }

    @Override
    public void joueurArrive(Personnage personne) {
        // On regarde si le solde du joueur est suffisant pour acheter
        if (personne.soldeSuffisant(rue.getPrixAchat())) {
            // Le joueur souhaite acheter le terrain
            if (personne.proposerAchat(rue.getPrixAchat())) {
                // Le joueur est débité du solde
                personne.debiterSolde(rue.getPrixAchat());
                // L'etat de la rue passe de Libre à occupé
                rue.setEtat(new RueOccupe(rue));
                rue.setProprietaire(personne);
                personne.addPropriete(rue);
                // Si il possède maintenant toutes les rues du quartier
                if (rue.verifQuartier()) {
                    rue.setQuartierConstructible();
                    rue.joueurArrive(personne);
                }
            }
        }
    }
}
