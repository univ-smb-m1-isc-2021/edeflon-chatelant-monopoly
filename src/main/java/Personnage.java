import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2fd67426-d8c1-4c1c-a14c-2a48e5c804d2")
public class Personnage {
    @objid ("db4894fe-8344-42a2-9e6c-c46405bdb5c9")
    public int solde;

    @objid ("68bf883f-bce2-4b73-bb33-7128718ef1f9")
    public Case position;

    @objid ("a0300948-5488-4d62-b779-d01276a020c8")
    public List<Propriete> mesProprietes = new ArrayList<Propriete> ();

    @objid ("114721ca-1328-4094-b4b4-c1fa8bc4bc70")
    public void setPosition(Case case) {
    }

    @objid ("802b853c-f4ce-4d3d-9dbf-3efc6bf7823c")
    public void aToiDeJouer(LesDes des) {
    }

    @objid ("a6a1e4ed-8de9-44f4-992a-fa8204db6293")
    public void jouerTour() {
    }

    @objid ("782de785-d210-4ded-806f-b078bab4a65a")
    public void acheter() {
    }

    @objid ("003bfb42-7aeb-4591-9aa0-5e60b94b659f")
    public void proposerAchat(float prix) {
    }

    @objid ("1017f72b-8588-41fb-a508-3722450bb8fc")
    public boolean payerLoyer(int montant) {
    }

    @objid ("671a6e6f-6fa4-4cb2-8ddd-c60eedf6d1dc")
    public boolean estProprietaire(Propriete case) {
    }

    @objid ("a669c71d-3cf5-4ef5-97aa-64d11800e46b")
    public boolean debiterSolde(int montant) {
    }

    @objid ("398ea798-3bb7-48af-8d62-625b2abf6e34")
    public boolean créditerSolde(int montantLoyer) {
    }

    @objid ("04751af9-308d-4623-979c-21ca2784d55c")
    public int lancerDes() {
    }

    @objid ("5f64e9fd-abff-44d6-94ea-6391af5ededd")
    public int nbGaresPossedees() {
    }

    @objid ("a934f371-bf7a-4eab-bf21-3852295e4038")
    public int soldeSuffisant(int p1) {
    }

    @objid ("a27da7ea-7209-48f5-9ccd-a27fe0d462c2")
    public boolean demandeConstruction() {
    }

}
