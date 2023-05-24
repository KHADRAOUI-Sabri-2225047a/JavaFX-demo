package com.example.demo.Exo11;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Graphmain extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("exo11.fxml"));
        Graph controller = new Graph();
        loader.setController(controller);

        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setTitle("Évolution de la population");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}