
package agnieszkagithub.creationSimpleObject;

public class Category {
    String name;

    @Override
    public String toString() {
        return "Category{" + "name=" + name + '}';
    }
    
    public Category(String name) {
        this.name = name;
    }
}
