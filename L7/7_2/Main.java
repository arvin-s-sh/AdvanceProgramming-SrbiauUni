package L7_2;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Model db = new Model();
        System.out.println("welcome to saipa app");
        System.out.println("there is list of our cars : ");
        db.printAllCarsName();
        System.out.println("for see price and buy car please type car name : ");
        String carName = new Scanner(System.in).nextLine();
        System.out.println(carName + " price is : "+ db.getCarPriceByName(carName) + "T");
    }

}
