public class Student {

    private String name;
    private String surname;
    private int group;

    public Student(int group, String name, String surname) {
        this.group = group;
        this.name = name;
        this.surname = surname;
    }

 /*
    добавление нового студента
    удаление по фамилии
    contains - есть ли студент с определенной фамилией в группе
    clear - очистка массива
    trim - удаление пустых элементов массива
    обьединение двух групп
    сортировка по фамилии
    containsAll - есть ли группа студентов в другой группе
    equals - одинаковые ли группы
    print - красивый вывод на печать группы
*/

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
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


}
