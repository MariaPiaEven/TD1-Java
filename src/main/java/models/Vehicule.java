package models;

public class Vehicule {

    protected int nombreDeRoue;

    protected String marque;


    public Vehicule(int nombreDeRoue, String marque) {
        this.nombreDeRoue = nombreDeRoue;
        this.marque = marque;
    }

    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    public void setNombreDeRoue(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String info(){
        return "Vehicule a " + nombreDeRoue + " roues";
    }


}



