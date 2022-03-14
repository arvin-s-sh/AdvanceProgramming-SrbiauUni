package session5_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map teenMap = new HashMap();
        System.out.println("write your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("write your student number  : ");
        String studentNumber = new Scanner(System.in).nextLine();
        System.out.println("write your average score : ");
        String strAverageScore = new Scanner(System.in).nextLine();
        Float averageScore = Float.parseFloat(strAverageScore);

        Teenager teenager = new Teenager();
        teenager.setName(name);
        teenager.setStudentNumber(studentNumber);
        teenager.setAverageScore(averageScore);

        teenMap.put("name" , teenager.getName());
        teenMap.put("student number" , teenager.getStudentNumber());
        teenMap.put("average score" , teenager.getAverageScore());

        System.out.println("--------------------------------------------------------------");

        System.out.println("name : " + teenMap.get("name"));
        System.out.println("student number : " + teenMap.get("student number"));
        System.out.println("average score : " + teenMap.get("average score"));
    }
}
