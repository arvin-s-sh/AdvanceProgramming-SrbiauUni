package com.example.fx;

import java.sql.SQLException;

public interface IModel {
    int getPassByUser(String user) throws SQLException;
    String getEmailByUser(String user) throws SQLException;
    Void insertUser(String name, String workExperience,int age ,String email) throws SQLException;
    Void updateUser(String user, int pass,String email) throws SQLException;
}
