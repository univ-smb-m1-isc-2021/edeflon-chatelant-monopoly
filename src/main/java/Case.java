import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("753b863b-a1ce-4bd6-86f5-9a29c73377a3")
public abstract class Case {
    @objid ("32be3185-a0e8-45ef-9b59-7488b0a7e6fc")
    public Case caseSuivante;

    @objid ("6a4af674-5283-435f-b2d2-5be6030b56c2")
    public Case avancer(int nbCases) {
    }

    @objid ("a77a7c22-b946-4281-ade0-dff093715265")
    public void joueurArrive(Personnage perso) {
    }

}
