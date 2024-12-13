package org.example;

public class VaccinsCongeles extends Vaccins implements ITarif{

    private int numerosVaccinCongele;
    private int appelDuConstructeur;
    private boolean diferanteDestination;

    public VaccinsCongeles(String cible, float temperatureMax, String continentDestination, Laboratoires laboratoire) {
        super(cible, temperatureMax, continentDestination, laboratoire);
        this.numerosVaccinCongele = 1; // faire un conteur dans le constructeur pour increment le numero de 1 a chaue fois
        this.diferanteDestination = false;
    }

    public int getNumerosVaccinCongele() {
        return numerosVaccinCongele;
    }

    public void setNumerosVaccinCongele(int numerosVaccinCongele) {
        this.numerosVaccinCongele = numerosVaccinCongele;
    }

    public int getAppelDuConstructeur() {
        return appelDuConstructeur;
    }

    public void setAppelDuConstructeur(int appelDuConstructeur) {
        this.appelDuConstructeur = appelDuConstructeur;
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
        if (getTemperatureMax() <10){
            total = 2 ;
        }else if (diferanteDestination){
            total = total + 5;
        }
        else{
            total = tarrifDeBase ;
        }
        return total +10;// on ajoute 10 par rapport a un vaccins classic car il est plus froid

    }

    public String toString(){
        return "Vaccin congele, a pour cible: " + getCible() + ", a pour température maximum de conservation " +
                getTemperatureMax() + " , son numero de suivi est " + getNumerosVaccinCongele() +
                ", et provient du labo " + getLaboratoire().getNom();
    }
}
