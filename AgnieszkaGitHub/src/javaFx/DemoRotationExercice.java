/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFx;

/**
 *
 * @author 2501agpestel
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DemoRotationExercice extends Application {



    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        int size = 100;
        
        Rectangle square1 = new Rectangle(size, size, Color.BLUE);
        
        Rectangle square2 = new Rectangle(size, size, Color.YELLOW);
        
        Pane pane = new StackPane(square1, square2);
        
        square1.setRotate(45);

        Scene scene = new Scene(pane, 2 * size, 2 * size); 
        primaryStage.setTitle("squares"); 
        primaryStage.setScene(scene);
        primaryStage.show();                                               
    }
    
}
