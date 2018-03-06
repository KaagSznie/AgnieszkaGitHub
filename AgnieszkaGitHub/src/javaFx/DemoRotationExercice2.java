/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 2501agpestel
 */
public class DemoRotationExercice2 extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        int size = 100;
        
        Circle bigCircle = new Circle(size/1.4, Color.RED);
        
        Rectangle square = new Rectangle(size, size, Color.BLACK);
        
        Circle smallCircle = new Circle(size / 2, Color.YELLOW);
        
        square.setRotate(45);
        
        Pane pane = new StackPane(bigCircle, square, smallCircle);
        
        Scene scene = new Scene(pane, 2 * size, 2 * size);
        primaryStage.setTitle("okno");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
