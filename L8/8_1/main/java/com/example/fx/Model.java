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
        ResultSet resultSet1 = statement.executeQuery(String.format("SELECT password from users1  WHERE username = '%s';", user));
        while (resultSet1.next())
        {
            int password = resultSet1.getInt(1);
            return password;
        }

        return 0;
    }

    @Override
    public Void insertUser(String name, String workExperience,int age ,String email) throws SQLException {
        PreparedStatement pst = connection.prepareStatement(String.format("INSERT INTO work (name , work_experience,age ,email) VALUES ('%s',%s,'%s','%s');", name ,workExperience,age,email));
        pst.executeUpdate();
        return null;
    }

}
