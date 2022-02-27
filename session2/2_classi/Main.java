package practice_classi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the library");
        System.out.println("select what do you want to do : ");
        System.out.println("1_borrow a book");
        System.out.println("2_get back the book");
        String strCommand = new Scanner(System.in).nextLine();
        int command = Integer.parseInt(strCommand);
        library library = new library();
        switch (command){
            case 1 :
                library.borrow();
                break;
            case 2 :
                library.BackBook();
                break;
        }


    }
}
