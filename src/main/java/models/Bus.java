package models;

import models.Vehicule;

public class Bus extends Vehicule {

    private int nombreDePassenger;

    public Bus(String marque, int nombreDeRoue, int nombreDePassenger) {
        super(nombreDeRoue, marque);
        this.nombreDePassenger = nombreDePassenger;
    }

    public int coutMaintenanceRoue(){
        return nombreDeRoue * 500;
    }

    public int getNombreDePassenger() {
        return nombreDePassenger;
    }

    public void setNombreDePassenger(int nombreDePassenger) {
        this.nombreDePassenger = nombreDePassenger;
    }


}
