package L9_1;

import java.sql.*;
import java.util.ArrayList;

public class Model {
    public String connectionUrl = "jdbc:jtds:sqlserver://Arvin:1433/java_DB;instance=MSSQLSERVER";
    Connection connection = DriverManager.getConnection(connectionUrl);
    Statement statement = connection.createStatement();

    public Void insertPerson(String name, int age, String email, String job) throws SQLException {
        PreparedStatement pst = connection.prepareStatement(String.format("INSERT INTO threadProgram (name , age ,email,job) VALUES ('%s',%s,'%s','%s');", name ,age,email,job));
        pst.executeUpdate();
        return null;
    }
    public void getPerson() throws SQLException {
        ResultSet rst;
        Statement stm ;
        stm = connection.createStatement();
        rst = stm.executeQuery(String.format("Select * From threadProgram where name ='%s';",GetInfo_Thread1.name));
        ArrayList<Person> personList = new ArrayList<>();
        while (rst.next()) {
            Person person = new Person(rst.getInt("id"), rst.getString("name"), rst.getInt("age"), rst.getString("email"),rst.getString("job"));
            personList.add(person);
            System.out.println("name : "+person.name);
            System.out.println("age : "+person.age);
            System.out.println("email : "+person.email);
            System.out.println("job : "+person.job);
        }
    }

    public Model() throws SQLException {
    }
}
