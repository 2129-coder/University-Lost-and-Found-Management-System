package com.university.lostfound.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("dashboard-view.fxml")
        );
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.setTitle("University Lost and Found Management System");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
