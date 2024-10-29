package com.example.eventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle = new Circle();
    private double x;
    private double y;



    public void up(ActionEvent event){
        System.out.println("up");
        circle.setCenterY(y-=1);
    }
    public void right(ActionEvent event){
        System.out.println("right");
        circle.setCenterX(x+=1);
    }
    public void bottom(ActionEvent event){
        System.out.println("bottom");
        circle.setCenterY(y+=1);
    }
    public void left(ActionEvent event){
        System.out.println("left");
        circle.setCenterX(x-=1);
    }

}
