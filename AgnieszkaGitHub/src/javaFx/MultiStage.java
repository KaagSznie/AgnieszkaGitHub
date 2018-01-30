/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author 2501agpestel
 */
public class MultiStage extends Application {

    @Override
    public void start(Stage stage1) {
        Stage stage2 = new Stage();
        
        stage1.setTitle("première fenêtre");
        stage2.setTitle("deuxième fenêtre");
        
        stage1.show();
        stage2.show();
        
        stage1.setX(0);
        stage1.setY(0);
        
    }
   
    public static void main(String[] args) {
        Application.launch(args);
    }
}
