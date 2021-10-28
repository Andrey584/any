package dayNine;

public class Task {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Первая группа");
        Teacher teacher = new Teacher("Мария Ивановна", "Биология");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

    }
}
