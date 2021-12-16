package com.example.f21comp1011gcfinala;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.EventListener;
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
        //typeListView.getItems().addAll(APIResponse.);
        //yearRadioButton.setSelected(false);
        //makeRadioButton.setSelected(false);

    }

    private Object optionsSelected() {
        if (yearRadioButton.isSelected()) {
            yearRadioButton.setSelected(false);
            makeRadioButton.setSelected(false);
        }
        else
        if (makeRadioButton.isSelected()) {
            yearRadioButton.setSelected(false);
            makeRadioButton.setSelected(true);
        }
        else
        if (yearRadioButton.isSelected()) {
            yearRadioButton.setSelected(true);
            makeRadioButton.setSelected(false);
        }
        return null;

    }
  


}
