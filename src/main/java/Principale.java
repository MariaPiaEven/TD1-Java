import models.*;

public class Principale {

    public static void main(String[] args) {

        Vehicule vehicule = new Vehicule(4, "fiat");

        Voiture voiture = new Voiture("fiat", 40);

        Bus bus = new Bus("Mercedes",4, 10);

        System.out.println(voiture.fraisKilometrique(4000));

    }
}
