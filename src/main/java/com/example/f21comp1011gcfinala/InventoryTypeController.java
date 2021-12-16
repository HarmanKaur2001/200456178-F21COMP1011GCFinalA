package com.example.f21comp1011gcfinala;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

public class InventoryTypeController {

    @FXML
    private Label numOfCarsLabel;

    @FXML
    private Label yearLabel;

    @FXML
    private Label dealerLabel;

    @FXML
    private ListView<String> typeListView;

    @FXML
    private ListView<Car> carListView;

    @FXML
    private RadioButton yearRadioButton;

    @FXML
    private RadioButton makeRadioButton;

}
