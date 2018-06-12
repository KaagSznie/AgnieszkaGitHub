
package exercice.exam;

public class DemoRobot {
    public static void main(String[] args) {
        //Robot robotTest = new Robot(4.1, 1, "model1", "name1", "description1");
        
        for(int i = 1; i <= 10; i++){
            
            Robot robotx = new Robot(4.1, i, "model" + i, "name" + i, "description" + i);
            System.out.println("robot" + i + " : " + robotx);
        }
        
    }

}

