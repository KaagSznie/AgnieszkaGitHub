
package agnieszkagithub.creationSimpleObject;

public class Person {
    String name;
    boolean walking = false;
    
    public Person () {};
    
    public Person (String name){
        this.name = name;
    }
    
    
    public String walk () {
        if (!walking) {
        return "Je marchais déjà";}
        else {return "Je commence à marcher";}
    }
}
