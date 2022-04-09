package practice_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("write your shape Lenth : ");
        String Lenth = new Scanner(System.in).nextLine();
        float fLenth = Float.parseFloat(Lenth);
        System.out.println("write your shape Hight : ");
        String Hight = new Scanner(System.in).nextLine();
        float fHight = Float.parseFloat(Hight);
        if (fLenth == fHight){
            square square = new square(fLenth,fHight);
            float environment = 2*(square.lenth+square.hight);
            float area = square.lenth*square.hight;
            System.out.println("your shape is square !");
            System.out.println("your shape environment is : "+ environment);
            System.out.println("your shape area is : "+ area);
        }
        else {
            rectangle rect = new rectangle(fLenth,fHight);
            float environment = (2*rect.lenth)+(2*rect.hight);
            float area = rect.lenth*rect.hight;
            System.out.println("your shape is rectangle !");
            System.out.println("your shape environment is : "+ environment);
            System.out.println("your shape area is : "+ area);
        }
    }
}
