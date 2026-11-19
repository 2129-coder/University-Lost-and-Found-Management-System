package com.university.lostfound.presentation.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {
    @FXML private Label welcomeLabel;

    @FXML
    public void initialize() {
        welcomeLabel.setText("Welcome to Lost and Found!");
    }
}
