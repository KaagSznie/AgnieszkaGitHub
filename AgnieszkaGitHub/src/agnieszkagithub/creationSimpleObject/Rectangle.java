
package agnieszkagithub.creationSimpleObject;

/**
 *
 * @author 2501agpestel
 */
public class Rectangle {
    double heigh;
    double width;
    
     double getArea() {
        return heigh * width;
    }
    
    double getPerimeter() {
        return (heigh + width) * 2;
    }
}
