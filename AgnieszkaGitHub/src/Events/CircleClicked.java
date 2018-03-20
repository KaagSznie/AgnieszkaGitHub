/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2501agpestel
 */
public class CircleClicked extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(100, Color.AQUA);
        circle.setOnMouseClicked(event -> {
            circle.setRadius(circle.getRadius());
        });
        
        StackPane root = new StackPane(circle);
        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
    
}
