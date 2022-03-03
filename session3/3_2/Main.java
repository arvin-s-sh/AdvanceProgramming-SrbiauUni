package session3_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write your lesson name (math , physic , programming , english) :");
        String lesson = new Scanner(System.in).nextLine();
        lesson.toLowerCase();
        switch (lesson){
            case "math":
                Math math = new Math();
                System.out.println("pishniaz ha : ");
                math.showPishniaz();
                System.out.println("hamniaz ha : ");
                math.showHamniaz();
                System.out.println("tedad vahed dars : ");
                math.showUnitCount();
                break;
            case "physic":
                Physic physic = new Physic();
                System.out.println("pishniaz ha : ");
                physic.showPishniaz();
                System.out.println("hamniaz ha : ");
                physic.showHamniaz();
                System.out.println("tedad vahed dars : ");
                physic.showUnitCount();
                break;
            case "programming":
                Programming programming = new Programming();
                System.out.println("pishniaz ha : ");
                programming.showPishniaz();
                System.out.println("hamniaz ha : ");
                programming.showHamniaz();
                System.out.println("tedad vahed dars : ");
                programming.showUnitCount();
                break;
            case "english":
                English english = new English();
                System.out.println("pishniaz ha : ");
                english.showPishniaz();
                System.out.println("hamniaz ha : ");
                english.showHamniaz();
                System.out.println("tedad vahed dars : ");
                english.showUnitCount();
                break;
        }
    }
}
