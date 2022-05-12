package L9_1;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        GetInfo_Thread1 thread1 = new GetInfo_Thread1();
        thread1.run();
        ShowInfo_thread2 thread2 = new ShowInfo_thread2();
        thread2.run();
        ShowFile_Thread3 thread3 = new ShowFile_Thread3();
        thread3.run();

    }
}
