package session5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your user name : ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("enter your password (only numbers) : ");
        String strPass = new Scanner(System.in).nextLine();
        int pass = Integer.parseInt(strPass);
        System.out.println("enter your email : ");
        String email = new Scanner(System.in).nextLine();

        User <Integer,String> user1 =new User<>();
        user1.setUser(userName);
        user1.setPass(pass);
        user1.setEmail(email);
        User<Integer, String> user2 = user1.clone();
        User<Integer, String> user3 = user1.clone();

        System.out.println("user 1 - "+"user name : " + user1.getUser()+" - pass : "+user1.getPass() + " - email : "+ user1.getEmail() );
        System.out.println("user 2 - "+"user name : " + user2.getUser()+" - pass : "+user2.getPass() + " - email : "+ user2.getEmail() );
        System.out.println("user 3 - "+"user name : " + user3.getUser()+" - pass : "+user3.getPass() + " - email : "+ user3.getEmail() );

    }
}
