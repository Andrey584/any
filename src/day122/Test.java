package day122;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List <String> brendAuto = new ArrayList<>();
        brendAuto.add("BMW");
        brendAuto.add("VW");
        brendAuto.add("Lada");
        brendAuto.add("Audi");
        brendAuto.add("Jeep");

        System.out.println(brendAuto.toString());
        brendAuto.add(2, "KIA");
        System.out.println(brendAuto);
        brendAuto.remove(0);
        System.out.println(brendAuto);



    }
}
