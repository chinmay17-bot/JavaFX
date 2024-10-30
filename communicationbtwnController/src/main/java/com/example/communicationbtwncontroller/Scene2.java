package com.example.communicationbtwncontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Scene2 {
    @FXML
    public Text name;

//    Label name = new Label("hi");

    public void displayName(String username){
        name.setText(username);
    }
}
