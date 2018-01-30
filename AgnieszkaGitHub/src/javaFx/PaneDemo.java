
package javaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PaneDemo extends Application{

    @Override
    public void start(Stage stage) {
        Button buttonOK = new Button("OK");
        Text text = new Text("Voici un text");
        text.setFill(Color.GREEN);
        TextField textField = new TextField();
        
        FlowPane pane = new FlowPane(buttonOK, text, textField);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
