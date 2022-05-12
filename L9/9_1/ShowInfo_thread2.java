package L9_1;

import java.sql.SQLException;
import java.util.ArrayList;

import L9_1.GetInfo_Thread1;

public class ShowInfo_thread2 implements Runnable{
    Model db = new Model();
    public ShowInfo_thread2() throws SQLException {
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            db.getPerson();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
