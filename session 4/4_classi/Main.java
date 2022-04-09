package session4_classi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DuplicateUserException {
        System.out.println("user 1 name : ");
        String name1 = new Scanner(System.in).nextLine();
        System.out.println("user 1 family : ");
        String family1 = new Scanner(System.in).nextLine();
        System.out.println("user 1 age : ");
        String strAge1 = new Scanner(System.in).nextLine();
        int age1  = Integer.parseInt(strAge1);

        User user1 = new User(name1,family1,age1);

        System.out.println("user 2 name : ");
        String name2 = new Scanner(System.in).nextLine();
        System.out.println("user 2 family : ");
        String family2 = new Scanner(System.in).nextLine();
        System.out.println("user 2 age : ");
        String strAge2 = new Scanner(System.in).nextLine();
        int age2  = Integer.parseInt(strAge1);

        User user2 = new User(name2,family2,age2);

        User[] users = {user1,user2};

        if (users[0].name.equals(users[1].name) && users[0].family.equals(users[1].family)  && users[0].age == users[1].age){
            throw new DuplicateUserException("user ha tekrari hastand ! ");
        }
        else {
            System.out.println("all done !");
        }
    }
}
