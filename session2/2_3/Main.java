package practice_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("etelaat moadele 1 ra vared konid ");
        System.out.println("zarib x ra vared konid : ");
        String strZaribX1 = new Scanner(System.in).nextLine();
        float zaribX1 = Float.parseFloat(strZaribX1);
        System.out.println("zarib y ra vared konid : ");
        String strZaribY1 = new Scanner(System.in).nextLine();
        float zaribY1 = Float.parseFloat(strZaribY1);
        System.out.println("javab moadele ra vared konid : ");
        String strAns1 = new Scanner(System.in).nextLine();
        float ans1 = Float.parseFloat(strAns1);

        System.out.println("-----------------------------------");
        System.out.println("etelaat moadele 2 ra vared konid ");
        System.out.println("zarib x ra vared konid : ");
        String strZaribX2 = new Scanner(System.in).nextLine();
        float zaribX2 = Float.parseFloat(strZaribX2);
        System.out.println("zarib y ra vared konid : ");
        String strZaribY2 = new Scanner(System.in).nextLine();
        float zaribY2 = Float.parseFloat(strZaribY2);
        System.out.println("javab moadele ra vared konid : ");
        String strAns2 = new Scanner(System.in).nextLine();
        float ans2 = Float.parseFloat(strAns2);

        System.out.println("-----------------------------------");
        System.out.println("moadele 1 : "+ zaribY1 + "Y + "+ zaribX1 + "X = "+ ans1);
        System.out.println("moadele 2 : "+ zaribY2 + "Y + "+ zaribX2 + "X = "+ ans2);

        System.out.println("-----------------------------------");


        equation equation_1 = new equation(zaribX1,zaribY1,ans1);
        equation equation_2 = new equation(zaribX2,zaribY2,ans2);

        equation.calculate(equation_1.zaribX ,equation_1.zaribY,equation_1.ansewr,equation_2.zaribX,equation_2.zaribY,equation_2.ansewr );


    }
}
