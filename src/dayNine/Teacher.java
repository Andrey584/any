package dayNine;

public class Teacher extends Human{
   public String subjectName;


    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это преподаватель с именем " + getName());
    }

    public String getSubjectName() {
        return subjectName;
    }
}

