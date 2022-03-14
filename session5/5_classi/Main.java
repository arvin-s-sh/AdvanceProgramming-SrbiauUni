package session5_classi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write your name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("write your family : ");
        String family = new Scanner(System.in).nextLine();
        System.out.println("write your age : ");
        String strAge = new Scanner(System.in).nextLine();
        int age = Integer.parseInt(strAge);
        System.out.println("write your user name : ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("write your password : ");
        String pass = new Scanner(System.in).nextLine();
        System.out.println("write your job : ");
        String job = new Scanner(System.in).nextLine();

        Person person = new Person();
        person.setName(name);
        person.setFamily(family);
        person.setAge(age);
        person.setUserName(userName);
        person.setPassword(pass);
        person.setJob(job);

        System.out.println("name : "+person.getName());
        System.out.println("family : "+person.getFamily());
        System.out.println("age : "+person.getAge());
        System.out.println("user name : "+person.getUserName());
        System.out.println("password : "+person.getPassword());
        System.out.println("job : "+person.getJob());
    }
}
