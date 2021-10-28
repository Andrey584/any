package Lesson2;

import java.util.Scanner;

class Lesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите этажность своего дома");
        int value = scanner.nextInt();
        scanner.close();

        if(value>=1 && value<=4)
            System.out.println("Это малоэтажный дом");
        if(value>=5 && value<=8)
            System.out.println("Это среднеэтажный дом");
        if(value>9)
            System.out.println("Это многоэтажный дом");
    }
}
