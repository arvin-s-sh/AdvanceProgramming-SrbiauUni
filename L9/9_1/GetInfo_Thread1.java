package L9_1;

import java.sql.SQLException;
import java.util.Scanner;

public class GetInfo_Thread1 implements Runnable {
    Model db = new Model();
    static public String name = null;
    Integer age = 0;
    String email = null;
    String job = null;
    public boolean isInsert = false;

    public GetInfo_Thread1() throws SQLException {
    }

    @Override
    public void run() {
        try {
            getInfo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            insert();
            System.out.println("data insert Done !");
            isInsert = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void getInfo() throws InterruptedException {
        System.out.println("write your name : ");
        name = new Scanner(System.in).nextLine();
        Thread.sleep(1000);
        System.out.println("write your age : ");
        age = new Scanner(System.in).nextInt();
        Thread.sleep(1000);
        System.out.println("write your email : ");
        email = new Scanner(System.in).nextLine();
        Thread.sleep(1000);
        System.out.println("write your job : ");
        job = new Scanner(System.in).nextLine();
    }
    void insert() throws SQLException {
        db.insertPerson(name,age,email,job);
    }
}
