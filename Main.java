
public class Main {
    public static void main(String[] args) {

        Person dude=new Person("some dude",27);
        dude.printInfo();
        Student petya=new Student("Petya Poopkin", 18,"sociology",true);
        petya.printInfo();
        Teacher pyotr=new Teacher("Pyotr Ivanovich",60,"linguistics",false);
        pyotr.printInfo();
        pyotr.bribe();
        Tester nick=new Tester("Nick",28,"Automated","Middle");
        nick.printInfo();
        nick.release();

    }
}




