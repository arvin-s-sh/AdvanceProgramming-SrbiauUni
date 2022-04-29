package com.example.fx;

import java.sql.*;

public class Model implements IModel{
    public String connectionUrl = "jdbc:jtds:sqlserver://Arvin:1433/java_DB;instance=MSSQLSERVER";
    Connection connection = DriverManager.getConnection(connectionUrl);
    Statement statement = connection.createStatement();


    public Model() throws SQLException {
    }

    @Override
    public int getPassByUser(String user) throws SQLException {
        ResultSet resultSet1 = statement.executeQuery(String.format("SELECT password from user1  WHERE username = '%s';", user));
        while (resultSet1.next())
        {
            int password = resultSet1.getInt(1);
            return password;
        }

        return 0;
    }

    @Override
    public String getEmailByUser(String user) throws SQLException {
        ResultSet resultSet1 = statement.executeQuery(String.format("SELECT email from user1  WHERE username = '%s';", user));
        while (resultSet1.next())
        {
            String email = resultSet1.getString(1);
            return email;
        }

        return null;
    }

    @Override
    public Void insertUser(String name, String workExperience,int age ,String email) throws SQLException {
        PreparedStatement pst = connection.prepareStatement(String.format("INSERT INTO work (name , work_experience,age ,email) VALUES ('%s',%s,'%s','%s');", name ,workExperience,age,email));
        pst.executeUpdate();
        return null;
    }

    @Override
    public Void updateUser(String user, int pass, String email) throws SQLException {
        PreparedStatement pst = connection.prepareStatement(String.format("UPDATE user1 SET username = '%s', password = %s ,email = '%s' WHERE username = '%s';", user ,pass,email,user));
        pst.executeUpdate();
        return null;
    }

}
