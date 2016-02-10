import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Test {
    public static void main(String[] args) throws Exception {

        try (FileReader fr1 = new FileReader("D://1.txt")) {
            int ch;
            FileWriter fw1 = new FileWriter("D://1r.txt");
            while ((ch = fr1.read()) != -1) System.out.print((char) ch);
            fw1.write(ch);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
