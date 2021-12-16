package com.example.f21comp1011gcfinala;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ResourceBundle;

public class InventoryTypeController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        dealerLabel.setText(APIUtility.getCarInfo().getDealership());

    }
}
