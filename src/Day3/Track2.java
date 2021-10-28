package Day3;

import java.util.Scanner;

class Track2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое и делитель:");


        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if(b==0)
                break;
            else
                System.out.println(a/b);



        }
    }
}
