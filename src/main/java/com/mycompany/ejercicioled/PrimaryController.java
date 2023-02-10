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

//Listener
   /* @FXML
    private void detenerLed(MouseEvent event) {

        if (shapeLed.isBlinking()) {
            shapeLed.setBlinking(false);
        } else {

            shapeLed.setBlinking(true);
        }

    }
//Metodo cambiar color con el raton
   /* @FXML
    private void cambioColor(MouseEvent event) {

        shapeLed.setLedColor(Color.AQUA);
    }

    @FXML
    private void detenerColor(MouseEvent event) {

        shapeLed.setLedColor(Color.RED);
    }*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

  

    @FXML
    private void cambiocolorBorder(ActionEvent event) {
     
        Color color = colorPicker.getValue();
        
    }

}
