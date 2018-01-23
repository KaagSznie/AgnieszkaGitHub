
package agnieszkagithub.creationSimpleObject;

public class testHouse {
    public static void main(String[] args) {
        Room hall = new Room("hall", 2.5, 2);
        Room sdb = new Room("salle de bain", 1, 5);
        Room salon = new Room("salon", 5, 2);
        Room chambre = new Room("chambre", 3, 5);
        Room cuisine = new Room("cuisine", 2, 4);
        
        House house = new House("rue Grande 100");
        
        house.roomList = new Room[5];
        house.roomList[0] = hall;
        house.roomList[1] = sdb;
        house.roomList[2] = salon;
        house.roomList[3] = chambre;
        house.roomList[4] = cuisine;
        
        System.out.println("Aire de la maison " + house.getArea() + "m2 ");
    }
}
