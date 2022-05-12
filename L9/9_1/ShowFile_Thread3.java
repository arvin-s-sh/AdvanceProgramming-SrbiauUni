package L9_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowFile_Thread3 implements Runnable {
    final String dir = System.getProperty("user.dir");
    BufferedReader in = new BufferedReader(new FileReader(dir+"\\L9_1\\9_1\\text.txt"));

    public ShowFile_Thread3() throws FileNotFoundException {
    }

    @Override
    public void run() {
        String line = null;
        while(true)
        {
            try {
                if ((line = in.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(line);
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
