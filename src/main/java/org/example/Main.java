package org.example;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LinkedList<Laboratoires> labo1 = new LinkedList<>();
        LinkedList<PourVacciner> equipement1 = new LinkedList<>();

        Laboratoires L1 = new Laboratoires("ulice", "Asie");
        Laboratoires L2 = new Laboratoires("jack", "Europe");
        Laboratoires L3 = new Laboratoires("james", "Amerique");

        labo1.add(L1);
        labo1.add(L2);
        labo1.add(L3);

        BoitesDeSeringues b1 = new BoitesDeSeringues(true, "Affrique", L1);
        Vaccins V1 = new Vaccins("peste", 20,"Asie", L2);
        VaccinsCongeles VC = new VaccinsCongeles("gripe", -20,"Asie", L3);

        equipement1.add(b1);
        equipement1.add(V1);
        equipement1.add(VC);

        for (int i = 0; i < equipement1.size(); i++) {
            System.out.println(equipement1.get(i).toString() + equipement1.get(i).trajetEffectue() + " le coup du transport est " + equipement1.get(i).tarrifTransport());

        }
    }
}