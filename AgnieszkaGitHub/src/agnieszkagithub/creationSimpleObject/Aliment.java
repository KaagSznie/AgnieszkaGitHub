
package agnieszkagithub.creationSimpleObject;

public class Aliment {
    String name;
    Category category;
    double kcal;
    double price;
    
    public Aliment (String name, Category category, double kcal, double price) {  //ALT+INSERT
        this.name = name;
        this.category = category;
        this.kcal = kcal;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Aliment{" + "name=" + name + ", category=" + category + ", kcal=" + kcal + ", price=" + price + '}';
    }
 
}
