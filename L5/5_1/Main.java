package session6_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("write your user name : ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("write your real name : ");
        String realName = new Scanner(System.in).nextLine();
        System.out.println("write your password : ");
        String strPassword = new Scanner(System.in).nextLine();
        Long password = Long.parseLong(strPassword);
        System.out.println("write your age : ");
        String strAge = new Scanner(System.in).nextLine();
        Integer age = Integer.parseInt(strAge);
        System.out.println("write your address : ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("write your phone number : ");
        String strPhoneNumber = new Scanner(System.in).nextLine();
        Long phoneNumber = Long.parseLong(strPhoneNumber);
        System.out.println("write your education : ");
        String education = new Scanner(System.in).nextLine();

        User user1 = new User().setUserName(userName).setRealName(realName).setPassword(password).setAge(age).setAddress(address).setPhoneNumber(phoneNumber).setEducation(education);

        System.out.println("user name : " + user1.getUserName());
        System.out.println("real name : " + user1.getRealName());
        System.out.println("password : " + user1.getPassword());
        System.out.println("age : " + user1.getAge());
        System.out.println("address : " + user1.getAddress());
        System.out.println("phone number : " + user1.getPhoneNumber());
        System.out.println("education : " + user1.getEducation());
    }
}
