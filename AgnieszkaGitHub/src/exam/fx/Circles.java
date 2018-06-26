
package exam.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author 2501agpestel
 */
public class Circles extends Application {
    @Override
    public void start(Stage stage) {
        // creation des cercles en utilisant la methode createCircle
        Circle circleAqua = createCircle(50.0f, "AQUA");
        Circle circlePink = createCircle(40.0f, "PINK");
        Circle circleAqua2 = createCircle(30.0f, "AQUA");
        Circle circlePink2 = createCircle(20.0f, "PINK");
        Circle circleAqua3 = createCircle(10.0f, "AQUA");
  
        
        // creation de la liste avec toutes les cercles
        Circle[] circleList = {
            circleAqua, circlePink, circleAqua2, circlePink2, circleAqua3
        };
        
        //creation des boutons avec la methode createButton
        Button buttonAgrandir = createButton("agrandir");
        Button buttonReduire = createButton("réduire");
        
        buttonChangeSize(buttonAgrandir, circleAqua, circlePink, circleAqua2, circlePink2, circleAqua3, 1.1);
        buttonChangeSize(buttonReduire, circleAqua, circlePink, circleAqua2, circlePink2, circleAqua3, 0.9);
        
        // creation du StackPane avec les circles
        StackPane stackpane = new StackPane(circleList);
        //hbox1.setAlignment(Pos.CENTER);
        stackpane.setStyle("-fx-border-color: black;");
        stackpane.setMargin(circleAqua, new Insets(20, 20, 20, 20));

        // ajoustement du centre des cercles par rapport au hbox1
        for(Circle circles : circleList){
            circles.centerXProperty().bind(stackpane.widthProperty().divide(2));
            circles.centerYProperty().bind(stackpane.heightProperty().divide(2));
        }
        
        //creation du HBox avec les 2 bouttons
        HBox hbox = new HBox(buttonAgrandir, buttonReduire);
        //vbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(10);
        hbox.setStyle("-fx-border-color: black;");
        hbox.setMargin(buttonAgrandir, new Insets(20, 20, 20, 20));
        hbox.setMargin(buttonReduire, new Insets(20, 20, 20, 20));
        
        // creation de vbox qui va contenir les 2 hbox
        BorderPane borderpane = new BorderPane();
        borderpane.setTop(stackpane);
        borderpane.setBottom(hbox);
        borderpane.setMargin(stackpane, new Insets(20, 20, 20, 20));
        borderpane.setMargin(hbox, new Insets(20, 20, 20, 20));
        
        Scene scene = new Scene(borderpane);
        
        
        stage.setScene(scene);
        stage.setTitle("Examen");
        stage.show();
    }

    
    // methode pour creer des cercles
    private Circle createCircle(double radius, String colorString) {
        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.setFill(Paint.valueOf(colorString));
        return circle;
    }
    
    // methode pour creer des bouttons
    private Button createButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setStyle("-fx-font: 15 Arial;");
        return button;
        
    }
    
    //methode pour changer la taille des cercles sur click on button
    private void buttonChangeSize(Button button, Circle circle1, Circle circle2 ,Circle circle3, Circle circle4, Circle circle5, double size) {
        button.setOnAction((ActionEvent event) -> {
            double radius1 = circle1.getRadius();
            double radius2 = circle2.getRadius();
            double radius3 = circle3.getRadius();
            double radius4 = circle4.getRadius();
            double radius5 = circle5.getRadius();
            circle1.setRadius(radius1 * size);
            circle2.setRadius(radius2 * size);
            circle3.setRadius(radius3 * size);
            circle4.setRadius(radius4 * size);
            circle5.setRadius(radius5 * size);
        });
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
