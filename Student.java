/**
 * Created by Nick on 28.05.2018.
 */
public class Student extends Person {
    private String faculty;
    private boolean graduate;

    public void printInfo() {
        System.out.println("\n\tSTUDENT INFO \n Name: " + name + ", Age: " + age + ", Faculty: " + faculty + ", Graduate: " + graduate);
    }

    Student(String name, int age, String faculty, boolean graduate) {
        super(name, age);
        this.faculty = faculty;
        this.graduate = graduate;
    }


    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }
}
