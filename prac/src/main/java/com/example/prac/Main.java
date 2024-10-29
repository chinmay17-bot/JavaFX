package com.example.prac;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root , 600 , 600 , Color.MAGENTA);
        Stage stage = new Stage();
        Text text = new Text();
        text.setText("Hiiiiii");
        text.setFont(Font.font("Verdana" , 30));
        text.setFill(Color.YELLOW);
        text.setX(300);
        text.setY(300);


        root.getChildren().add(text);

        stage.setScene(scene);
        stage.show();

    }
}
