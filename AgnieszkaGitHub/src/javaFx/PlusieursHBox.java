package javaFx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlusieursHBox extends Application{

    @Override
    public void start(Stage stage) {
        Button button1 = new Button("OUI");
        Button button2 = new Button("NON");
        Button button3 = new Button("JE NE SAIS PAS");
        
        button1.setStyle("-fx-font: 15 Arial; -fx-color: #00FF00");
        button2.setStyle("-fx-font: 15 Arial; -fx-color: #FF0000");
        button3.setStyle("-fx-font: 15 Arial; -fx-color: #FFFFFF");
        
        HBox hbox1 = new HBox(button1, button2, button3);
        hbox1.setSpacing(10);
        
        Text text1 = new Text("MON TEXTE");
        HBox hbox2 = new HBox(text1);
        hbox2.setAlignment(Pos.CENTER);
        
        Circle circle1 = new Circle(30);
        HBox hbox3 = new HBox(circle1);
        hbox3.setAlignment(Pos.CENTER);
        
        TextField textField1 = new TextField();
        HBox hbox4 = new HBox(textField1);
        hbox4.setAlignment(Pos.CENTER);
        
        ImageView image1 = new ImageView();
        HBox hbox5 = new HBox(image1);
        hbox5.setAlignment(Pos.CENTER);
        
        VBox vbox1 = new VBox(hbox1, hbox2, hbox3, hbox4, hbox5);
        
        
        vbox1.setStyle("-fx-font: 20 Arial; -fx-background-color: #AAA");
              
        //FlowPane flowPane = new FlowPane(vbox1);
        
        vbox1.setMargin(hbox1, new Insets(20, 20, 20, 20));
        vbox1.setMargin(hbox2, new Insets(20, 20, 20, 20));
        vbox1.setMargin(hbox3, new Insets(20, 20, 20, 20));
        vbox1.setMargin(hbox4, new Insets(20, 20, 20, 20));
        vbox1.setMargin(hbox5, new Insets(20, 20, 20, 20));
         
        Scene scene = new Scene(vbox1);
        stage .setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
