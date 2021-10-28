package Proba;

import java.util.*;

public class Proba {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("Bob", 16);
        Person person2 = new Person("Johny", 25);
        Person person3 = new Person("Katy", 37);
        Person person4 = new Person("Klara", 14);
        Person person5 = new Person("Nasty", 12);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge() > o2.getAge())
                    return 1;
                else if(o1.getAge() < o2.getAge())
                    return -1;
                else return 0;
            }
        });
        System.out.println(personList);

    }


}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
