package com.gluonhq.springignitedemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SimpleViewController {

    @FXML
    private GridPane root;

    @FXML
    private Label label;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private void initialize() {
        System.out.println("eh");
        button1.setOnAction( e -> label.setText("Button 1 clicked"));
        button2.setOnAction( e -> label.setText("Button 2 clicked"));
    }

}
