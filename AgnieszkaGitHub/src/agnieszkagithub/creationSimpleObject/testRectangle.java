
package agnieszkagithub.creationSimpleObject;

/**
 *
 * @author 2501agpestel
 */
public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.heigh = 10;
        rectangle1.width = 10;
        
        Rectangle rectangle2 = new Rectangle();
        rectangle2.heigh = 1;
        rectangle2.width = 20;
        
        System.out.println("Rectangle 1 with heigh and width : " + rectangle1.heigh + ", " + rectangle1.width + " has area : " + rectangle1.getArea() + " and perimeter : " + rectangle1.getPerimeter());
        System.out.println("Rectangle 2 with heigh and width : " + rectangle2.heigh + ", " + rectangle2.width + " has area : " + rectangle2.getArea() + " and perimeter : " + rectangle2 .getPerimeter());
    }
}
