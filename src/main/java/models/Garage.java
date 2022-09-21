package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Garage {

    protected String nom;

    protected ArrayList<Voiture> listeVoitures = new ArrayList<>();


    public Garage(String nom) {
        this.nom = nom;
    }

    public void ajoutVoiture(Voiture... tableaVoiture) {

//        for (Voiture voiture : tableaVoiture) {
//            listeVoitures.add(voiture);
//        }

        Collections.addAll(listeVoitures, tableaVoiture);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Voiture> getListeVoitures() {
        return listeVoitures;
    }

    public void setListeVoitures(ArrayList<Voiture> listeVoitures) {
        this.listeVoitures = listeVoitures;
    }

}


