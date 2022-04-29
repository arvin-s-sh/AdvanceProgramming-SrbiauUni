package com.example.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class HelloController {
    public TextField txtName;
    public TextField txtEmail;
    Model db = new Model();
    public TextField txtPassword;
    public TextField txtUserName;
    public Alert alert = new Alert(Alert.AlertType.NONE);
    @FXML
    private Label loginText;

    public HelloController() throws SQLException {
    }

    @FXML
    protected void login() throws SQLException {
        try {
            String txtUser = txtUserName.getText();
            String txtPass = txtPassword.getText();
            if (db.getPassByUser(txtUser) == Integer.parseInt(txtPass)){
                //loginText.setText("you are login!");
                alert.setAlertType(Alert.AlertType.CONFIRMATION);
                alert.setContentText("you are login !");
                alert.show();
            }
            else {
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
        }
    }
    @FXML
    protected void signup() throws SQLException {
        try {
            String txtUser = txtUserName.getText();
            String txtPass = txtPassword.getText();
            String txtNamee = txtName.getText();
            String txtEmaill = txtEmail.getText();
            db.insertUser(txtUser,Integer.parseInt(txtPass),txtEmaill,txtNamee);
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setContentText("your sign up is complete !");
            alert.show();
        } catch (SQLException | NumberFormatException e) {
            //loginText.setText("please enter valid data");
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("please enter valid data");
            alert.show();
        }
    }
}