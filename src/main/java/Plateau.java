import java.util.List;
import java.util.ArrayList;

public class Plateau {
    public Case caseDepart;

    public Plateau(){
        creerCase();
    }

    public Case getCaseDepart() {
        return caseDepart;
    }

    private void creerCase() {
        caseDepart = new CaseDepart();

        // Liste de toutes les cases propriétés
        // Param : Nom, loyerVide, loyer1Maison, loyer2Maisons, loyer3Maisons, loyer4Maisons, loyerHotel
        Rue marron1 = new Rue("Boulevard de Belleville", 60, 2, 10, 30, 90, 160, 250);
        caseDepart.setSuivant(marron1);

        CaisseCommu caisse1 = new CaisseCommu();
        marron1.setSuivant(caisse1);

        Rue marron2 = new Rue("Rue Lecourbe", 60, 4, 20, 60, 180, 320, 450);
        caisse1.setSuivant(marron2);

        Taxes impots = new Taxes("Impôts sur le revenu", 200);
        marron2.setSuivant(impots);

        Gare montparnasse = new Gare("Gare Montparnasse");
        impots.setSuivant(montparnasse);

        Rue bleuClair1 = new Rue("Rue de Vaugirard", 100, 6, 30, 90, 270, 400, 550);
        montparnasse.setSuivant(bleuClair1);

        CaseChance chance1 = new CaseChance();
        bleuClair1.setSuivant(chance1);

        Rue bleuClair2 = new Rue("Rue de Courcelles", 100, 6, 30, 90, 270, 400, 550);
        chance1.setSuivant(bleuClair2);

        Rue bleuClair3 = new Rue("Avenue de la république", 120, 8, 40, 100, 300, 450, 600);
        bleuClair2.setSuivant(bleuClair3);

        Prison prison = new Prison();
        bleuClair3.setSuivant(prison);

        Rue rose1 = new Rue("Boulevard de la villette", 140, 10, 50, 150, 450, 625, 750);
        prison.setSuivant(rose1);

        Service elec = new Service("Compagnie de Distribution d'électricité", 150);
        rose1.setSuivant(elec);

        Rue rose2 = new Rue("Avenue de Neuilly", 140, 10, 50, 150, 450, 625, 750);
        elec.setSuivant(rose2);

        Rue rose3 = new Rue("Rue du paradis", 160, 12, 60, 180, 500, 700, 900);
        rose2.setSuivant(rose3);

        Gare lyon = new Gare("Gare de Lyon");
        rose3.setSuivant(lyon);

        Rue orange1 = new Rue("Avenue Mozart", 180, 14, 70, 200, 550, 750, 950);
        lyon.setSuivant(orange1);

        CaisseCommu caisse2 = new CaisseCommu();
        orange1.setSuivant(caisse2);

        Rue orange2 = new Rue("Boulevard Saint-Michel", 180, 14, 70, 200, 550, 750, 950);
        caisse2.setSuivant(orange2);

        Rue orange3 = new Rue("Place Pigalle", 200, 16, 80, 220, 600, 800, 1000);
        orange2.setSuivant(orange3);

        ParcGratuit parc = new ParcGratuit();
        orange3.setSuivant(parc);

        Rue rouge1 = new Rue("Avenue Matignon", 220, 18, 90, 250, 700, 875, 1050);
        parc.setSuivant(rouge1);

        CaseChance chance2 = new CaseChance();
        rouge1.setSuivant(chance2);

        Rue rouge2 = new Rue("Boulevard Malesherbes", 220, 18, 90, 250, 700, 875, 1050);
        chance2.setSuivant(rouge2);

        Rue rouge3 = new Rue("Avenue Henri-Martin",  240, 20, 100, 300, 750, 925, 1100);
        rouge2.setSuivant(rouge3);

        Gare nord = new Gare("Gare du Nord");
        rouge3.setSuivant(nord);

        Rue jaune1 = new Rue("Faubourg Saint-Honoré", 260, 22, 110, 330, 800, 975, 150);
        nord.setSuivant(jaune1);

        Rue jaune2 = new Rue("Place de la Bourse", 260,  22, 110, 330, 800, 975, 150);
        jaune1.setSuivant(jaune2);

        Service eaux = new Service("Compagnie de distribution des eaux", 150);
        jaune2.setSuivant(eaux);

        Rue jaune3 = new Rue("Rue de la fayette", 280, 24, 120, 360, 850, 1025, 1200);
        eaux.setSuivant(jaune3);

        Prison goPrison = new Prison();
        jaune3.setSuivant(goPrison);

        Rue vert1 = new Rue("Avenue de Breteuil", 300, 26, 130, 390, 900, 1100, 1275);
        goPrison.setSuivant(vert1);

        Rue vert2 = new Rue("Avenue Foch", 300, 26, 130, 390, 900, 1100, 1275);
        vert1.setSuivant(vert2);

        CaisseCommu caisse3 = new CaisseCommu();
        vert2.setSuivant(caisse3);

        Rue vert3 = new Rue("Boulevard des capucines", 320, 28, 150, 450, 1000, 1200, 1400);
        caisse3.setSuivant(vert3);

        Gare saintLazare = new Gare("Gare Saint-Lazare");
        vert3.setSuivant(saintLazare);

        CaseChance chance3 = new CaseChance();
        saintLazare.setSuivant(chance3);

        Rue bleuFonce1 = new Rue("Avenue des Champs-Élysées", 350, 35, 175, 500, 1100, 1300, 1500);
        chance3.setSuivant(bleuFonce1);

        Taxes luxe = new Taxes("Taxe de luxe", 100);
        bleuFonce1.setSuivant(luxe);

        Rue bleuFonce2 = new Rue("Rue de la paix", 400, 50, 200, 600, 1400, 1700, 2000);
        luxe.setSuivant(bleuFonce2);
        bleuFonce2.setSuivant(caseDepart);


        // Ajout des propriétés sous liste pour les quartiers
        List<Rue> lMarron = new ArrayList<>();
        lMarron.add(marron1);
        lMarron.add(marron2);

        List<Rue> lBleuC = new ArrayList<>();
        lBleuC.add(bleuClair1);
        lBleuC.add(bleuClair2);
        lBleuC.add(bleuClair3);

        List<Rue> lRose = new ArrayList<>();
        lRose.add(rose1);
        lRose.add(rose2);
        lRose.add(rose3);

        List<Rue> lOrange = new ArrayList<>();
        lOrange.add(orange1);
        lOrange.add(orange2);
        lOrange.add(orange3);

        List<Rue> lRouge = new ArrayList<>();
        lRouge.add(rouge1);
        lRouge.add(rouge2);
        lRouge.add(rouge3);

        List<Rue> lJaune = new ArrayList<>();
        lJaune.add(jaune1);
        lJaune.add(jaune2);
        lJaune.add(jaune3);

        List<Rue> lVert = new ArrayList<>();
        lVert.add(vert1);
        lVert.add(vert2);
        lVert.add(vert3);

        List<Rue> lBleuF = new ArrayList<>();
        lBleuF.add(bleuFonce1);
        lBleuF.add(bleuFonce2);

        // Les quartiers
        Quartier marron = new Quartier(lMarron, 50);
        marron1.setQuartier(marron);
        marron2.setQuartier(marron);

        Quartier bleuClair = new Quartier(lBleuC, 50);
        bleuClair1.setQuartier(bleuClair);
        bleuClair2.setQuartier(bleuClair);
        bleuClair3.setQuartier(bleuClair);

        Quartier rose = new Quartier(lRose, 100);
        rose1.setQuartier(rose);
        rose2.setQuartier(rose);
        rose3.setQuartier(rose);

        Quartier orange = new Quartier(lOrange, 100);
        orange1.setQuartier(orange);
        orange2.setQuartier(orange);
        orange3.setQuartier(orange);

        Quartier rouge = new Quartier(lRouge, 150);
        rouge1.setQuartier(rouge);
        rouge2.setQuartier(rouge);
        rouge3.setQuartier(rouge);

        Quartier jaune = new Quartier(lJaune, 150);
        jaune1.setQuartier(jaune);
        jaune2.setQuartier(jaune);
        jaune3.setQuartier(jaune);

        Quartier vert = new Quartier(lVert, 200);
        vert1.setQuartier(vert);
        vert2.setQuartier(vert);
        vert3.setQuartier(vert);

        Quartier bleuFonce = new Quartier(lBleuF, 200);
        bleuFonce1.setQuartier(bleuFonce);
        bleuFonce2.setQuartier(bleuFonce);

        // Permets aux gares de se connaître mutuellement
        List<Gare> lGares = new ArrayList<>();
        lGares.add(montparnasse);
        lGares.add(lyon);
        lGares.add(nord);
        lGares.add(saintLazare);

        montparnasse.setGares(lGares);
        lyon.setGares(lGares);
        nord.setGares(lGares);
        saintLazare.setGares(lGares);

        // Permet aux services de se connaître
        elec.setOtherService(eaux);
        eaux.setOtherService(elec);
    }
}
