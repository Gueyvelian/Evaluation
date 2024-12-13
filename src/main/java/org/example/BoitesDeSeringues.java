package org.example;

public class BoitesDeSeringues extends PourVacciner implements ITarif{

    private boolean volumineux;
    private boolean diferanteDestination;

    public BoitesDeSeringues(boolean volumineux, String continentDestination, Laboratoires laboratoire) {
        super( continentDestination,  laboratoire);
        this.volumineux = volumineux;
    }

    public boolean isVolumineux() {
        return volumineux;
    }

    public void setVolumineux(boolean volumineux) {
        this.volumineux = volumineux;
    }

    @Override
    public void tarrifDeTransportMajore() {
        if (!getContinentDestination().equals(this.getLaboratoire().getContinent())){
            diferanteDestination = true;
        }
    }

    @Override
    public float tarrifTransport() {
        float tarrifDeBase = 0.1F;
        float total = 0;
        if (volumineux){
            total = tarrifDeBase + 0.5F;
        }
        else if (diferanteDestination){
            total = total + 5;
        }else{
            total = tarrifDeBase;
        }
        return total;
    }



    public String  trajetEffectue(){

        return "La boite de seringues va de " + this.getLaboratoire().getContinent() + " à " + getContinentDestination();
    }

    public String toString(){
        return "Seringue, a un gros volume: " + isVolumineux() + " et vien du labo " + getLaboratoire().getNom();
    }


}
