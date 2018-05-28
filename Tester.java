/**
 * Created by Nick on 28.05.2018.
 */
public class Tester extends Person {
    private String testType;
    private String skillLevel;

    public void printInfo() {
        System.out.println("\n\tTESTER INFO \n Name: " + name + ", Age: " + age + ", Testing Type: " + testType + ", Skill Level: " + skillLevel);
    }

    public Tester(String name, int age, String testType, String skillLevel) {
        super(name, age);
        this.testType = testType;
        this.skillLevel = skillLevel;
    }

    void release() {
        System.out.print("\n\t!TIME FOR RELEASE!\n " + name + " says: ");
        if (skillLevel == "Senior") {
            System.out.println("\"We're in the pipe, five by five.\"");
        } else if (skillLevel == "Middle") {
            System.out.println("\"Hang on, we're in for some chop!\"");
        } else
            System.out.println("\"That's it man, game over man! GAME OVER!\"");
    }


    public void setTestType(String testType) {
        this.testType = testType;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
}
