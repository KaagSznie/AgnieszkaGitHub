package Events;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Un bouton qui écrit dans la console quand on le clique
 */
public class ExerciceChangeColor extends Application {

    private boolean isWhite = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("VERT");
        Button buttonExit = new Button ("Exit");
        HBox hbox = new HBox(button, buttonExit);
        
        button.setOnAction((ActionEvent event) -> {
            if(isWhite) {
            button.setStyle("-fx-color: #00FF00");
            button.setText("BLANC");
            /*isWhite = false;*/}
            else {button.setStyle("-fx-color: #FFFFFF");
            button.setText("VERT");
            /*isWhite = true*/
            }
            isWhite =! isWhite;
        });
        
        buttonExit.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
        
        StackPane root = new StackPane(hbox);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Listing 15.1");
        primaryStage.show();
    }

}
