package practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        float sumScores = 0;
        int lessonsCount = 0;
        int i = 1;
        while (loop) {
            System.out.println("write your lesson " + i + " score : ");
            String strScore = new Scanner(System.in).nextLine();
            float score = Float.parseFloat(strScore);
            System.out.println("write your Coefficient for lesson " + i + " : ");
            String strCoefficient = new Scanner(System.in).nextLine();
            int Coefficient = Integer.parseInt(strCoefficient);
            lesson lesson = new lesson(score, Coefficient);
            sumScores = (lesson.score * lesson.coefficient) + sumScores;
            lessonsCount = lesson.coefficient + lessonsCount;
            System.out.println("do you want to add more lesson (y,n) ? ");
            String strLoop = new Scanner(System.in).nextLine();
            strLoop = strLoop.toLowerCase();
            if (strLoop.equals("n")) {
                loop = false;
            }
            i++;

        }
        float average = sumScores / lessonsCount;
        System.out.println("-----------------------------------------------");
        System.out.println("your grade average is : " + average);
    }
}
