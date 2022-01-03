import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("beb4cbb7-607f-45ef-96d8-912506b9377d")
public class Rue extends Propriete {
    @objid ("351f7046-4828-4f1a-9f03-15a2e4dd85aa")
    public int nbMaisons;

    @objid ("a0771162-9ae4-4cb6-98fd-6cfff121cb06")
    public EtatRue etatRue;

    @objid ("4add0090-9340-4e95-959d-db556d9ca579")
    public Quartier quartier;

    @objid ("77be9a3f-4a28-4344-a89a-e37c0acd742b")
    public boolean verifQuartier() {
    }

    @objid ("99185ff0-87bf-4e9a-b3bf-ceb26adee414")
    public int prixConstruction() {
    }

    @objid ("8465c8d6-31e3-47cc-b7ed-ff5c07dd43af")
    public int getMaisons() {
    }

}
