package Day8;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Петя");


        Teacher teacher = new Teacher("Наталья Кузьминична", "математика");
        teacher.evaluate(student);
        student.setNameStudent("Аркадий");

        teacher.setNameTeacher("Алевтина Васильевна");
        teacher.setItem("Биология");

        teacher.evaluate(student);

    }

}
