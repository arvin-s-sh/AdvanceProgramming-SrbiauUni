package L7_classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Model db = new Model();

        System.out.println("select one option : ");
        System.out.println("1 - sign up");
        System.out.println("2 - login");
        int option = new Scanner(System.in).nextInt();

        //---------------login area--------------------------
        if (option == 2){
            boolean loop = true;
            while (loop){
                System.out.println("write your user name : ");
                String userName = new Scanner(System.in).nextLine();
                System.out.println("write your password : ");
                int password = new Scanner(System.in).nextInt();
                if (db.getPassByUser(userName) == password){
                    System.out.println("you are login !");
                    loop =false;
                }
                else {
                    System.out.println("try again , user name or password incorrect !");
                }
            }
        }
        //---------------sign up area--------------------------
        if (option == 1){
            User user = new User();
            System.out.println("write your user name : ");
            user.setUserName(new Scanner(System.in).nextLine());
            System.out.println("write your user password : ");
            user.setPassword(new Scanner(System.in).nextInt());
            System.out.println("write your email : ");
            user.setEmail(new Scanner(System.in).nextLine());
            System.out.println("write your name : ");
            user.setEmail(new Scanner(System.in).nextLine());
            db.insertUser(user.getUserName(),user.getPassword(),user.getEmail(),user.getName());
            System.out.println("your registration is complete !");
        }
    }
}
