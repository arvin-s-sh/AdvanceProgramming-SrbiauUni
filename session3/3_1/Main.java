package session3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write your first number : ");
        String strNum1 = new Scanner(System.in).nextLine();
        float num1 = Float.parseFloat(strNum1);
        System.out.println("write your second number : ");
        String strNum2 = new Scanner(System.in).nextLine();
        float num2 = Float.parseFloat(strNum2);

        Calculator calculator = new Calculator(num1,num2);
        System.out.println("sum is : "+calculator.sum());
        System.out.println("mines is : "+calculator.mines());
        System.out.println("multiple is : "+calculator.multiple());
        System.out.println("devide is : "+calculator.devide());
    }
}
