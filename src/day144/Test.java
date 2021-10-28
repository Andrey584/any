package day144;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static final File file1 = new File("people");
    private static final List<String> spisok = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(file1));
    }


       public static List<String> parseFileToStringList(File file){


            try {
                Scanner scanner = new Scanner(file1);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    spisok.add(line);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
           return spisok;
        }



    }

