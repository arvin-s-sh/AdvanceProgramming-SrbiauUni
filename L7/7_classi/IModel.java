package L7_classi;

import java.sql.SQLException;

public interface IModel {
    int getPassByUser(String user) throws SQLException;
    Void insertUser(String user,int pass ,String email,String name) throws SQLException;
}
