
package agnieszkagithub.creationSimpleObject;

/**
 * exemple objet
 * @author 2501agpestel
 */
public class TestClassClient {
    public static void main(String[] args) {
        Client olivier = new Client();
        olivier.identifier = "R2D2";
        olivier.firstName = "Olivier";
        olivier.familyName = "Durant";
        olivier.telephone = "025658768654";
        olivier.drivingLicense = "444558";
        olivier.address = "18 rue du Paradis, 1000 Bruxelles";
        
        System.out.println("Le nouveau client s'appelle : " + olivier.familyName + " " + olivier.firstName);
    }
}
