package com.example.firstproj;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root ,  500 , 600,Color.YELLOWGREEN );

        stage.setScene(scene );

        Text text = new Text("Done");
        root.setCenter(text);
        stage.setTitle("practice window");
        Image img = new Image("D:\\JAVAfx\\firstProj\\src\\main\\java\\img.jpg");
        stage.getIcons().add(img);
        stage.show();
    }
}
