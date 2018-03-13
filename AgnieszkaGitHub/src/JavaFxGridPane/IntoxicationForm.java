/*
pour refactorer : sélectionner tout le texte, cliquer droit --> refactorer + insert + methode
*/


package JavaFxGridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IntoxicationForm extends Application {

    GridPane pane = new GridPane();
    
    @Override
    public void start(Stage stage) {
        pane.setPadding(new Insets(10) );
        pane.setHgap(10);
        pane.setVgap(10);
        
        createLine("Nom :",0);
        
        createLine("Description :", 1);
        
        createLine("Population :", 2);
        
        createLine("Critere :", 3);
        
        Button buttonAdd = new Button("Ajouter");
        pane.add(buttonAdd, 2, 3);
        
        Text text = new Text();
        pane.add(text, 1, 4);
        
        Button button = new Button("Soumettre");
        pane.add(button, 1, 5);
        
        Scene scene = new Scene(pane, 350, 300);
        stage.setScene(scene);
        stage.setTitle("Formulaire intox");
        stage.show();
    }

    private void createLine(String label, int line) {
        Label labelNom = new Label(label);
        pane.add(labelNom, 0, line);
        TextField inputNom = new TextField();
        pane.add(inputNom, 1, line);
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
