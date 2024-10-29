package com.example.components;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
        primaryStage.setTitle("Components");
        BorderPane root = new BorderPane();

        Text txt = new Text("A new text");
        Button btn = new Button("BUTTON");



        txt.setY(100);
        txt.setY(200);
        root.setCenter(txt);



        root.setCenter(btn);
        Scene scene = new Scene(root , 500,600);

        primaryStage.setScene(scene);
        primaryStage.show();
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }
}
