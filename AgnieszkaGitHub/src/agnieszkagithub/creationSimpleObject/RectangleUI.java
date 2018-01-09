
package agnieszkagithub.creationSimpleObject;

import java.util.Scanner;

public class RectangleUI { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle3 = new Rectangle();
        System.out.print("heigh : ");
        rectangle3.heigh = input.nextDouble();
        System.out.print("width : ");
        rectangle3.width = input.nextDouble();
        System.out.println("area : " + rectangle3.getArea());  
        System.out.println("perimeter : " + rectangle3.getPerimeter());
    }
}
