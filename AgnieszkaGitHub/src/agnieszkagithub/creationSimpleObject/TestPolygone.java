
package agnieszkagithub.creationSimpleObject;

public class TestPolygone {
    public static void main(String[] args) {
       
        Polygone triangle = new Polygone(3);
        
        Side p1 = new Side(0,0);
        Side p2 = new Side(0,1);
        Side p3 = new Side(1,0);
        
        triangle.sideList[0] = p1;
        triangle.sideList[1] = p2;
        triangle.sideList[2] = p3;
        
        System.out.println(triangle.toString());
        System.out.println("Nombre de côtés du polygone = " + triangle.getSideNr());
        
    }
} 
