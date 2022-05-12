package L9_classi;

public class Main {
    public static void main(String[] args) {
        readFile_Thread1 thread1 = new readFile_Thread1();
        thread1.run();
        copyFile_Thread2 thread2 = new copyFile_Thread2();
        thread2.run();
    }
}
