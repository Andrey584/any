package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static int counterNumbers = 0;

    public static void printSumDigits(File file) {

        File file2 = new File("test2");
        try {
            Scanner scanner = new Scanner(file2);
            String line = scanner.nextLine();
            String[] numberString = line.split(";");
            if (numberString.length != 10)
                throw new IllegalArgumentException();
            int[] numbers = new int[10];
            int counter = 0;
            for (String number : numberString) {
                numbers[counter++] = Integer.parseInt(number);
            }

            for (int number2 : numbers) {
                counterNumbers += number2;
            }

            System.out.println(Arrays.toString(numbers));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException i) {
            System.out.println("Некорректный входной файл");
        }
    }

        public static int getCounterNumbers () {
            return counterNumbers;
        }
}


