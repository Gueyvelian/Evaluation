package org.example;

public class PourVacciner implements ITarif{

    private String continentDestination;
    private Laboratoires laboratoire;

    public PourVacciner(String continentDestination, Laboratoires laboratoire) {
        this.continentDestination = continentDestination;
        this.laboratoire = laboratoire;
    }


    public String getContinentDestination() {
        return continentDestination;
    }

    public void setContinentDestination() {
        this.continentDestination = continentDestination;
    }

    public Laboratoires getLaboratoire() {
        return laboratoire;
    }

    public void setLaboratoire(Laboratoires laboratoire) {
        this.laboratoire = laboratoire;
    }



    public String  trajetEffectue(){
        return ""; //redefini dans les classe filles
    }

    public String toString(){
        return ""; //redefini dans les classe filles
    }

    @Override
    public void tarrifDeTransportMajore() {

    }

    @Override
    public float tarrifTransport() {
        return 0;
    }
}
