import java.io.FileReader;
import java.io.FileWriter;


public class Test {
    public static void main(String[] args) throws Exception {

        FileReader fileReader1 = new FileReader("d:\\1in.txt");
        FileWriter fileWriter1 = new FileWriter("d:\\1out.txt");
        FileReader fileReader2 = new FileReader("d:\\2in.txt");
        FileWriter fileWriter2 = new FileWriter("d:\\2out.txt");
        FileReader fileReader3 = new FileReader("d:\\3in.txt");
        FileWriter fileWriter3 = new FileWriter("d:\\3out.txt");

        int ch1;
        while ((ch1 = fileReader1.read()) != -1) {
            System.out.print((char) ch1);
            fileWriter1.write(ch1);
        }

        fileReader1.close();
        fileWriter1.close();
        System.out.println();

        int ch2;
        while ((ch2 = fileReader2.read()) != -1) {
            System.out.print((char) ch2);
            fileWriter2.write(ch2);
        }

        fileReader2.close();
        fileWriter2.close();
        System.out.println();

        int ch3;
        while ((ch3 = fileReader3.read()) != -1) {
            System.out.print((char) ch3);
            fileWriter3.write(ch3);
        }

        fileReader3.close();
        fileWriter3.close();

//        MyThread thread = new MyThread();
//        thread.start();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getId() + " thread: " + i);
//        }
    }
}

//class MyThread extends Thread {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getId() + " thread: " + i);
//        }
//    }
//}