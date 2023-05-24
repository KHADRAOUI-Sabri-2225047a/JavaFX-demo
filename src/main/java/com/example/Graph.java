package com.example.demo.Exo11;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Graph implements Initializable {
    @FXML
    private TextField dateField;
    @FXML
    private TextField populationField;
    @FXML
    private Button addButton;
    @FXML
    private BarChart<String, Number> barChart;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private NumberAxis yAxis;

    private ObservableList<XYChart.Data<String, Number>> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Number> series = new XYChart.Series<>(data);
        barChart.getData().add(series);
    }

    @FXML
    private void addPopulation() {
        String date = dateField.getText();
        String populationText = populationField.getText();

        try {
            int population = Integer.parseInt(populationText);
            data.add(new XYChart.Data<>(date, population));

            dateField.clear();
            populationField.clear();
        } catch (NumberFormatException e) {
            // Gérer une erreur de format incorrect pour la population
        }
    }
}