
package agnieszkagithub.creationSimpleObject;

public class testHouse {
    public static void main(String[] args) {
        Room hall = new Room("hall", 2.5, 2);
        Room sdb = new Room("salle de bain", 1, 5);
        Room salon = new Room("salon", 5, 2);
        Room chambre = new Room("chambre", 3, 5);
        Room cuisine = new Room("cuisine", 2, 4);
        
        House house = new House();
    }
}
