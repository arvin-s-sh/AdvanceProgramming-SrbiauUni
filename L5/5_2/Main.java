package session6_2_singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome");
        System.out.println("write your user name : ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("write your password : ");
        String strPassword = new Scanner(System.in).nextLine();
        Long password = Long.parseLong(strPassword);
        System.out.println("write your email : ");
        String email = new Scanner(System.in).nextLine();

        User user1 =  User.getInstance(userName,password,email);

        System.out.println("user name : "+user1.getUserName());
        System.out.println("user password : "+user1.getPassword());
        System.out.println("user email : "+user1.getEmail());
    }
}
