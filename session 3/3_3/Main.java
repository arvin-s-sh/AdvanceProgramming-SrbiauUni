package session3_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your number : ");
        String strNum = new Scanner(System.in).next();
        int num = Integer.parseInt(strNum);
        MyInteger myInteger = new MyInteger(num);
        myInteger.isEven(num);
        myInteger.isOdd(num);
        myInteger.isPositive(num);
        myInteger.isNegative(num);
        myInteger.isZero(num);


    }
}
