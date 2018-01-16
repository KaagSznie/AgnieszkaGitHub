
package agnieszkagithub.creationSimpleObject;

public class Room {
    public String name;
    public double lenght;
    public double width;
    
    public double getArea(){
        return lenght * width;
    }
    
    public Room() {};
    public Room(String name, double lenght, double width) {
        this.name = name;
        this.lenght = lenght;
        this.width = width;
    }
}
