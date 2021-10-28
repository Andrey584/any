package day14;

import java.io.File;
import java.io.FileNotFoundException;

public class task {
    public static void main(String[] args) {

        File file = new File("test2");
        Test.printSumDigits(file);
        System.out.println(Test.getCounterNumbers());


    }
}
