package com.example.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.sql.SQLException;

public class HelloController {
    public TextField txtUserName;
    public TextField txtPass;
    public TextField txtEmail;
    public VBox edit_form;
    public TextField txtUserNameLogin;
    public TextField txtPassLogin;
    public VBox login_form;
    Model db = new Model();
    public Alert alert = new Alert(Alert.AlertType.NONE);
    @FXML
    private Label loginText;

    public HelloController() throws SQLException {
    }

    @FXML
    protected void update() throws SQLException {
        try {
            String strName = txtUserName.getText();
            String strPass = txtPass.getText();
            String strEmail = txtEmail.getText();
            txtUserName.setText(String.valueOf(txtUserNameLogin));
            txtPass.setText(String.valueOf(db.getPassByUser(String.valueOf(txtUserNameLogin))));
            txtEmail.setText(db.getEmailByUser(String.valueOf(txtUserNameLogin)));

            db.updateUser(strName,Integer.parseInt(strPass),strEmail);
            //db.insertUser(strName,strWorkExp,Integer.parseInt(strAge),strEmail);
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setContentText("your data updated !");
            alert.show();
        } catch ( NumberFormatException e) {
            //loginText.setText("please enter valid data");
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("please enter valid data");
            alert.show();
        }
    }
}