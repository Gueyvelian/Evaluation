package org.example;

public class Vaccins extends PourVacciner implements ITarif{

    private String cible;
    private float temperatureMax;
    private boolean diferanteDestination;

    public Vaccins(String cible, float temperatureMax, String continentDestination, Laboratoires laboratoire) {
        super( continentDestination,  laboratoire);
        this.cible = cible;
        this.temperatureMax = temperatureMax;
        this.diferanteDestination = false;
    }

    public String getCible() {
        return cible;
    }

    public void setCible(String cible) {
        this.cible = cible;
    }

    public float getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    @Override
    public void tarrifDeTransportMajore() {
        if (!getContinentDestination().equals(this.getLaboratoire().getContinent())){
            diferanteDestination = true;
        }
    }

    @Override
    public float tarrifTransport() {
        float tarrifDeBase = 0.5F;
        float total = 0;
        if (temperatureMax <10){
            total = 2;
        }else if (diferanteDestination){
            total = total + 5;
        }
        else{
            total = tarrifDeBase;
        }
        return total;
    }


    public String  trajetEffectue(){
        return " La boite de vaccins va de " + this.getLaboratoire().getContinent() + " à " + getContinentDestination();
    }

    public String toString(){
        return "Vaccin, traite: " + getCible() + " et a pour température maximum de conservation "
                + getTemperatureMax(); //redefini dans les classe filles
    }
}
