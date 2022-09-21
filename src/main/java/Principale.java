import models.*;

public class Principale {

    public static void main(String[] args) {

        Vehicule vehicule = new Vehicule(4, "fiat");

        Voiture voiture = new Voiture("fiat", 34);

        Bus bus = new Bus("Mercedes",6, 10);

        System.out.println(voiture.fraisKilometrique(4000));

        System.out.println(vehicule.info());

        System.out.println(bus.info());

    }
}
