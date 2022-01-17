public class Service extends Propriete {

    private Service otherService;
    private int prix;
    private LesDes lesDes;
    private int resDes;

    public Service(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
        this.lesDes = new LesDes();
    }

    // Prix de base * montant dés * 4 (si un seul service)
    // Prix de base * montant dés * 10 (si 2 services)
    @Override
    public int calculLoyer() {
        int multiplicateur = 4;

        if (this.proprietaire.equals(otherService.proprietaire)) {
            multiplicateur = 10;
        }
        return (resDes * multiplicateur);
    }

    @Override
    public void joueurArrive(Personnage perso) {
        // Si le terrain n'est pas acheté
        if (proprietaire == null) {
            // Si le joueur a assez d'argent et le joueur souhaite acheté
            if (perso.soldeSuffisant(prixAchat) && perso.proposerAchat(prixAchat)) {
                proprietaire = perso;
                perso.addPropriete(this);
            }
            // Sinon si le perso n'est pas le propriétaire
        } else if (!proprietaire.equals(perso)) {
            this.resDes = perso.lancerDes(lesDes);
            System.out.println(perso.nom + " lance les dés, il obtient : " + resDes);
            int loyer = calculLoyer();
            perso.debiterSolde(loyer);
            proprietaire.crediterSolde(loyer);
        }
        // Sinon on ne fait rien
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
