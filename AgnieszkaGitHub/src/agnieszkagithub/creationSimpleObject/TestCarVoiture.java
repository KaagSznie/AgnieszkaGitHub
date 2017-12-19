package agnieszkagithub.creationSimpleObject;

/**
 *
 * @author 2501agpestel
 */
public class TestCarVoiture {

    public static void main(String[] args) {
        Car mazda = new Car();
        mazda.color = "black";
        mazda.km = 10050.5;
        mazda.licensePlate = "OO5682P";
        mazda.model = "mazda";
        mazda.year = 2010;
        
        System.out.println(mazda.getDescription());
        
        //System.out.println("La nouvelle voiture " + mazda.model + " est de couleur " + mazda.color);
        
    }
}
