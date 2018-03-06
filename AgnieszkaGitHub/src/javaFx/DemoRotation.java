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
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DemoRotation extends Application {



    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("OK");                   // crée un bouton
        btOK.setStyle("-fx-border-color: blue;");         // ajoute une bordure bleue
        StackPane pane = new StackPane(btOK);    // crée un pane qui contient le bouton
        pane.setRotate(45);                                       // applique une rotation de 45 degrés
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");
                                                                               // bordure rouge et couleur de fond gris léger
        Scene scene = new Scene(pane, 200, 250);             // crée une scène
        primaryStage.setTitle("NodeStyleRotateDemo");      // titre de la fenêtre
        primaryStage.setScene(scene);                                 // ajoute la scène à la fenêtre
        primaryStage.show();                                                 // affiche la fenêtre
    }
    
}
