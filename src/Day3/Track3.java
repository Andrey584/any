package Day3;

import java.util.Scanner;

class Track3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(counter<5){
            System.out.println("Введите делимое и делитель:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if(b==0){
                System.out.println("Деление на ноль");
            counter++;
            continue;
            }
            System.out.println(a/b);
            counter++;
         }
    }
}
