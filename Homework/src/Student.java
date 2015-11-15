public class Student {

    private String name;
    private String surname;
    private int group;
    private int[] marks = new int[5];
    private char[] attend = new char[]{'n', 'n', 'n', 'n', 'n', 'n'};

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(char[] attend, String name, String surname, int group, int[] marks) {
        this.attend = attend;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.marks = marks;
    }


    public void removeBySurname() {
        surname = "n/a";
        name = "n/a";
        group = 0;
        for (int i = 0; i < marks.length; i++) marks[i] = 0;
        for (int i = 0; i < attend.length; i++) attend[i] = 'n';

    }

//    public char[] getAttend() {
//        return attend;
//    }
//
//    public void setAttend(char[] attend) {
//        this.attend = attend;
//    }

//    public int[] getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int[] marks) {
//        this.marks = marks;
//    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getInfo() {
        System.out.println(name + " " + surname + " " + group);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        for (char att : attend) {
            System.out.print(att + " ");
        }
        System.out.println();

    }


}
