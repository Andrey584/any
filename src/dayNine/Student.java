package dayNine;

public class Student extends Human{
    private String groupName;
    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это студент с именем " + getName());
    }

    public String getGroupName(){
        return groupName;
    }
}
