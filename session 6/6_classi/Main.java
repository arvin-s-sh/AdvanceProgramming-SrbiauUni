package session6_classi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write your Phrase : ");
        String strPhrase = new Scanner(System.in).nextLine();
        char[] phrase = strPhrase.toCharArray();
        char operator = phrase[1];
        Integer num1 = phrase[0] - '0';
        Integer num2 = phrase[2] - '0';
        if (operator == '+'){
            calcPlus calcPlus1 = new calcPlus();
            System.out.println("plus answer is : ");
            System.out.println(calcPlus1.calc(num1,num2));
        }
        if (operator == '-'){
            calcMinus calcMinus1 = new calcMinus();
            System.out.println("minus answer is : ");
            System.out.println(calcMinus1.calc(num1,num2));
        }
    }
}
