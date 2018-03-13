
package JavaFxGridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Template extends Application{

    @Override
    public void start(Stage stage) {
        Rectangle rectangle1 = new Rectangle(50, 50, Color.BROWN);
        Rectangle rectangle2 = new Rectangle(100, 100, Color.YELLOW);
        
        StackPane pane = new StackPane(rectangle2, rectangle1);
        Scene scene = new Scene(pane, 200, 300);
        stage.setScene(scene);
        stage.setTitle("Template");
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}

