package com.example.stylingwithcss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
            Scene scene = new Scene(root);
//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//              OR BETTER WAY IS TO USE IT LIKE
            String css = Objects.requireNonNull(this.getClass().getResource("application.css")).toExternalForm();
            scene.getStylesheets().add(css);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
