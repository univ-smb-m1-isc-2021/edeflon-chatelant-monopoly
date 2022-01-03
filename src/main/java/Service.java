public class Service extends Propriete {

    private Service otherService;
    private int prix;
    private LesDes lesDes;
    private int resDes;

    public Service(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Prix de base * montant dés * 4 (si un seul service)
    // Prix de base * montant dés * 10 (si 2 services)
    @Override
    public int calculLoyer() {
        int multiplicateur = 4;

        if (this.proprietaire.equals(otherService.proprietaire)) {
            multiplicateur = 10;
        }
        return (this.prix * resDes * multiplicateur);
    }

    @Override
    public void joueurArrive(Personnage perso) {
        System.out.println(perso.nom + " sur la case " + this.nom + ".");
        // Si le terrain n'est pas acheté
        if(proprietaire == null){
            // Si le joueur a assez d'argent
            if(perso.soldeSuffisant(prixAchat)){
                // Proposer achat, si le joueur achete
                if(perso.proposerAchat(prixAchat)){
                    proprietaire = perso;
                    perso.addPropriete(this);
                }
            }
        } else if (proprietaire != perso) {
            this.resDes = perso.lancerDes(lesDes);
            int loyer = calculLoyer();
            perso.debiterSolde(loyer);
            proprietaire.créditerSolde(loyer);
        }
    }

    @Override
    public void setSuivant(Case caseCible) {
        this.caseSuivante = caseCible;
    }

    public void setOtherService(Service service2) {
        this.otherService = service2;
    }

    public void setProprietaire(Personnage personne) {
        this.proprietaire = personne;
    }
}
