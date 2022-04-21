package L7_2;

import java.sql.SQLException;
import java.util.List;

public interface IModel {
    void printAllCarsName () throws SQLException;
    int getCarPriceByName(String name) throws SQLException;
}
