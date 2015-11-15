import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student vova=new Student("Vova", "Vasilev");
        Student petro=new Student("Petro", "Pettrovich");
        petro.getInfo();
        petro.removeBySurname();
        petro.getInfo();
        vova.getInfo();

    }
}
