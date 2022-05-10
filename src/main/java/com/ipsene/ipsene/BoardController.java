package com.ipsene.ipsene;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BoardController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}