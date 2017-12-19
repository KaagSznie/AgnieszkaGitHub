package agnieszkagithub.creationSimpleObject;

/**
 *
 * @author 2501agpestel
 */
public class Car {

    String licensePlate;
    int year;
    String color;
    double km;
    String model;
    
    String getDescription() {
        return "La voiture est :\n" + "\tmodèle : " + model + "\n" + "\tannée : " + year + "\n" + "\tcouleur : " + color;
    }
}
