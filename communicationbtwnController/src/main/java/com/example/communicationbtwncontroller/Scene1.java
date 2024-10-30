package com.example.communicationbtwncontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1 {


    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    TextField nameTextField;


    public void submit(ActionEvent event) throws IOException {
        String username = nameTextField.getText();
        System.out.print(username);
        //WE DO IT THIS WAY SO THAT WE NEED THE LOADER AGAIN
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = fxmlLoader.load();

        //TO ACCESS ANY METHODS IN THIS CLASS
        Scene2 scene2 = fxmlLoader.getController();
        scene2.displayName(username);

//        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
