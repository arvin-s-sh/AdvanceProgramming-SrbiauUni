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
    public Void insertUser(String user, int pass, String email, String name) throws SQLException {
        PreparedStatement pst = connection.prepareStatement(String.format("INSERT INTO users1 (username , password ,email,name) VALUES ('%s',%s,'%s','%s');", user ,pass,email,name));
        pst.executeUpdate();
        return null;
    }

}
