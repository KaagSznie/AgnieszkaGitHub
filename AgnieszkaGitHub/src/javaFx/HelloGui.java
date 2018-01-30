
package javaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloGui extends Application {

    //GUI - Graphical User Interface
    // extends - héritage
    // ALT + ENTER pour créer le méthode Start
    
    @Override
    public void start(Stage stage) throws Exception {
        Button hello = new Button("hello");
        hello.setMaxSize(50, 25);
        //hello.setStyle("-fx-font: 30 Arial; -fx-background-color: #00F");
        hello.setStyle("-fx-font: 30 Arial; -fx-color: #00F"); 
        //FF0000 rouge
        //00FF00 vert
        //0000FF bleu
        //000000 noir
        //FFFFFF blanc
        //AAAAAA gris
        //A0A0A0 gris
        
        Scene scene = new Scene(hello);
        stage.setTitle("fenêtre");
        stage.setHeight(300);
        stage.setWidth(500);
        stage.setScene(scene);
        
        stage.show(); //force l'affichage de la fenêtre
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
