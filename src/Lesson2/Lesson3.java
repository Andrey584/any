package Lesson2;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;
        System.out.println("Введите Ваше число:");
        double x = scanner.nextInt();
        scanner.close();

        if(x>=5)
            System.out.println(y = (Math.pow(x, 2) - 10)/(x+7));
        else if(x>-3 && x<5)
            System.out.println(y = (x+3) * (Math.pow(x, 2) - 2));

        else {
            System.out.println(y = 420);
        }




    }
}
