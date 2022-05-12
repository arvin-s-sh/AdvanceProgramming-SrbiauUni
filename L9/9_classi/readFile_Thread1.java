package L9_classi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readFile_Thread1 implements Runnable{
    public static List<String> text=new ArrayList<String>();

    @Override
    public void run() {
            try {
                File myObj = new File("C:\\Users\\arvin\\IdeaProjects\\practice\\src\\L9_classi\\file1.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String txt = myReader.nextLine();
                    //System.out.println(txt);
                    text.add(txt);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
}
