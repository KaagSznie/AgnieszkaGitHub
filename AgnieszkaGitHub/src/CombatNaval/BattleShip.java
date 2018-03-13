
package CombatNaval;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class BattleShip extends Application{
    GridPane pane = new GridPane();
 
    
    @Override
    public void start(Stage stage) {
        
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Rectangle rectangle = new Rectangle(100, 50, Color.AQUA);
                pane.add(rectangle, i, j);
            }
        }
        
        int a = (int)(Math.random()* 3);
        int b = (int)(Math.random()* 3);
        
        Rectangle bateau = new Rectangle(100, 50, Color.WHITE);
        pane.add(bateau, a, b);

        

        Scene scene = new Scene(pane, 370, 200);
        stage.setScene(scene);
        stage.setTitle("Battle Ship");
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
