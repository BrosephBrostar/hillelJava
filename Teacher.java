/**
 * Created by Nick on 28.05.2018.
 */
public class Teacher extends Person {
    private String faculty;
    private boolean acceptsBribes;

    public void printInfo() {
        System.out.println("\n\tTEACHER INFO \n Name: " + name + ", Age: " + age + ", Faculty: " + faculty + ", Accepts $$$: " + acceptsBribes);
    }

    Teacher(String name, int age, String faculty, boolean acceptsBribes) {
        super(name, age);
        this.faculty = faculty;
        this.acceptsBribes = acceptsBribes;
    }

    void bribe() {
        System.out.print("\n\tATTEMPTING TO BRIBE $$$ " +name+"\n");
        if (acceptsBribes) {
            System.out.println(  " \"Eh, it's a livin'.\"");
        } else {
            System.out.println( " \"Get out of here, you!\"");
        }
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setAcceptsBribes(boolean acceptsBribes) {
        this.acceptsBribes = acceptsBribes;
    }
}
