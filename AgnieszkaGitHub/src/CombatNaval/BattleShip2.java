package CombatNaval;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Simple battle ship
 * Cette version implémente seulement une grille 3x3 
 */
public class BattleShip2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("Battle Ship");
        text.setFill(Color.WHITE);
        text.setFont();
        
        GridPane gridPane = new GridPane();     // crée le :GridPane
        gridPane.setAlignment(Pos.CENTER);      // centre les objets dans les cellules
        gridPane.setPadding(new Insets(10));    // ajoute de l'espace entre entre le bord et le contenu
        gridPane.setHgap(10);                   // ajoute des gouttières horizontales (espace entre les cellules)
        gridPane.setVgap(10);                   // ajoute des gouttières verticales
        
        GridPane gridPaneComp = new GridPane();
        gridPaneComp.setAlignment(Pos.CENTER);
        gridPaneComp.setPadding(new Insets(10));
        gridPaneComp.setHgap(10);
        gridPaneComp.setVgap(10);
        
        
        // pour construire le tableau de 3x3 cellules
        for(int col=0; col<10; col++) {  // boucle sur les lignes
            for(int line=0; line<10; line++) {   // boucle sur les colonnes
                // ajoute un Rectangle à la colonne "col" et à la ligne "line"
                Rectangle rectangle = new Rectangle(30, 30, Color.BLUE);
                gridPaneComp.add(rectangle, col, line);
            }
        }
        
        for(int col=0; col<10; col++) {  // boucle sur les lignes
            for(int line=0; line<10; line++) {   // boucle sur les colonnes
                // ajoute un Rectangle à la colonne "col" et à la ligne "line"
                Rectangle rectangle = new Rectangle(30, 30, Color.BLUE);
                rectangle.setOnMouseClicked(event -> {
                    if(rectangle.getFill().equals(Color.BLUE)) {
                    rectangle.setFill(Color.WHITE);}
                    else {
                        rectangle.setFill(Color.BLUE);
                    }
                });
                gridPane.add(rectangle, col, line);
            }
        }
        
        // code classique
        VBox vbox = new VBox(text, gridPaneComp, gridPane);
        StackPane pane = new StackPane(vbox);
        Scene scene = new Scene(pane);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Battle Ship");
        primaryStage.show();
    }
    
}
