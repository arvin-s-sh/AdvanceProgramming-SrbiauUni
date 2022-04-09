package session4_1;

import java.util.Scanner;

public class Main {
    private static final String _name = "ali";
    private static final String _userName = "ali1212";
    private static final String _password = "123456";
    public static void main(String[] args) throws UserException {

        System.out.println("write your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("write your user name : ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("write your password : ");
        String password = new Scanner(System.in).nextLine();


        if (!name.equals(_name) || !userName.equals(_userName) || !password.equals(_password)){
            throw new UserException("your data doesnt match with user data !");
        }
        else {
            System.out.println("welcome");
            System.out.println("you are loged in !");
        }


    }
}
