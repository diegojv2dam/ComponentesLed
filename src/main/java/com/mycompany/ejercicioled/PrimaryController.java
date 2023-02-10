/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ejercicioled;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;

public class PrimaryController implements Initializable {

    @FXML
    private ShapeLed shapeLed;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private ToggleButton switchLed;

    //Ejercicio 4.
    @FXML
    private void detenerLed(MouseEvent event) {

        if (shapeLed.isBlinking()) {
            shapeLed.setBlinking(false);
        } else {
            shapeLed.setBlinking(true);
        }

    }

    @FXML
    private void cambioColor(ActionEvent event) {

        shapeLed.setLedColor(colorPicker.getValue());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        shapeLed.setLedColor(Color.MAGENTA);
    }

}
