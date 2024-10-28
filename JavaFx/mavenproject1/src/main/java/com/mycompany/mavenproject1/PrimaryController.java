package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PrimaryController {
      // Link these fields with FXML using @FXML annotation
    @FXML
    private TextField nameTextField;

    @FXML
    private TextField emailTextField;
@FXML
    private TextField ageTextField;
    // @FXML annotation for the method linked to the button's action
    @FXML
    private void submit(ActionEvent event) {
        // Fetch input from the text fields
        String name = nameTextField.getText();
        String email = emailTextField.getText();
         String age = ageTextField.getText();
        // Create an alert to display the input values
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank you for registering!");
        alert.setContentText("Submitted Details:\nName: " + name +  "\nAge:" +age+ "\nEmail: " + email);
        alert.showAndWait();
    }

   
}
