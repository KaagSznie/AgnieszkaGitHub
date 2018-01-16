
package agnieszkagithub.creationSimpleObject;

/**
 *
 * @author 2501agpestel
 */
public class Rectangle {
    double heigh;
    double width;

    public Rectangle(double heigh, double width) {
        this.heigh = heigh;
        this.width = width;
    }
    
    public Rectangle() {};
    
    
    
     double getArea() {
        return heigh * width;
    }
    
    double getPerimeter() {
        return (heigh + width) * 2;
    }
}
