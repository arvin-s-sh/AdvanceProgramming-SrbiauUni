package L9_classi;

import java.io.FileWriter;
import java.io.IOException;

public class copyFile_Thread2 implements Runnable{
    @Override
    public void run() {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\arvin\\IdeaProjects\\practice\\src\\L9_classi\\file2.txt");
            int size = readFile_Thread1.text.size();
            for (int i = 0; i < size; i++) {
                myWriter.write(readFile_Thread1.text.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully copied file1 to file2");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
