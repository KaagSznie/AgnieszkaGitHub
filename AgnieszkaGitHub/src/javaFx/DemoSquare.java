package javaFx;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

    public class DemoSquare extends Application {

        public static void main(String[] args) {

            launch(args);

        }

        @Override

        public void start(Stage stage) throws Exception {

            Rectangle rectangle = new Rectangle();

            Circle circle = new Circle();

            Pane pane = new Pane(rectangle, circle);

            Scene scene = new Scene(pane, 400, 400);

            rectangle.setWidth(100);

            rectangle.setHeight(100);

            rectangle.setX((scene.getWidth() - rectangle.getWidth()) / 2);

            rectangle.setY((scene.getHeight() - rectangle.getHeight()) / 2);

            rectangle.setFill(Color.BLUE);

            rectangle.setStroke(Color.BLACK);

            rectangle.setStrokeWidth(3);

            circle.setCenterX(scene.getWidth() / 2);

            circle.setCenterY(scene.getHeight() / 2);

            circle.setRadius(rectangle.getHeight() / 2);

            circle.setFill(Color.GREEN);

            stage.setScene(scene);

            stage.setTitle("carré");

            stage.show();

        }

    }
