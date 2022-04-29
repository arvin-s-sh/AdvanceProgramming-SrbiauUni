package com.example.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class HelloController {
    public TextField txtRealName;
    public TextField txtExp;
    Model db = new Model();
    public TextField txtAge;
    public TextField txtEmail;
    public Alert alert = new Alert(Alert.AlertType.NONE);
    @FXML
    private Label loginText;

    public HelloController() throws SQLException {
    }

    @FXML
    protected void insert() throws SQLException {
        try {
            String strName = txtRealName.getText();
            String strWorkExp = txtExp.getText();
            String strAge = txtAge.getText();
            String strEmail = txtExp.getText();
            db.insertUser(strName,strWorkExp,Integer.parseInt(strAge),strEmail);
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setContentText("your employment form is complete !");
            alert.show();
        } catch (SQLException | NumberFormatException e) {
            //loginText.setText("please enter valid data");
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("please enter valid data");
            alert.show();
        }
    }
}