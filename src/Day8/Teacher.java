package Day8;

import java.util.Random;

public class Teacher {
    Random random = new Random();
    String nameTeacher;
    String item;

    public Teacher(String nameTeacher, String item) {
        this.nameTeacher = nameTeacher;
        this.item = item;
    }

    public void evaluate(Student student) {
        int max = 5;
        int min = 2;
        int x = random.nextInt((max - min) + 1) + min;
        String value;
        switch (x) {
            case 2 :
                System.out.println("неудовлетворительно");
                value = "неудовлетворительно";
                break;
            case 3 :
                System.out.println("удовлетворительно");
                value = "удовлетворительно";
                break;
            case 4 :
                System.out.println("хорошо");
                value = "хорошо";
                break;
            case 5 :
                System.out.println("отлично");
                value = "отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + x);
        }

        System.out.println("Преподаватель " + nameTeacher + " оценил студента с именем " + student.nameStudent + " по предмету " + item + " на оценку " + value);

    }



    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public String getItem() {
        return item;
    }
}