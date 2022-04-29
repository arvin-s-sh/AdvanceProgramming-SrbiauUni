package com.example.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {
    public TextField txtUserNameLogin;
    public TextField txtPassLogin;

    @FXML
    protected void login() throws SQLException {
        Model db = new Model();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        try {
            String txtUser = txtUserNameLogin.getText();
            String txtPass = txtPassLogin.getText();
            if (db.getPassByUser(txtUser) == Integer.parseInt(txtPass)) {
                //loginText.setText("you are login!");
                alert.setAlertType(Alert.AlertType.CONFIRMATION);
                alert.setContentText("you are login !");
                alert.show();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();


            } else {
                //loginText.setText("you are not login");
                alert.setAlertType(Alert.AlertType.WARNING);
                alert.setContentText("you are not login !");
                alert.show();
            }
        } catch (SQLException | NumberFormatException e) {
            //loginText.setText("please enter valid data");
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("please enter valid data");
            alert.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
