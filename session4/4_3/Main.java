package session4_3;

import session4_1.UserException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserException {
        System.out.println("write your text : ");
        String text = new Scanner(System.in).nextLine();
        for (int i = 0; i <= 10; i++) {
            String x = Integer.toString(i);
            if (text.contains(x)){
                throw new UserException("your text has number !");
            }
        }
        System.out.println("your text length is : "+text.length());
    }
}
