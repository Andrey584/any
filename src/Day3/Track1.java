package Day3;

import java.sql.SQLOutput;
import java.util.Scanner;

class Track1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введи название города:");
            String city = scanner.nextLine();
            if(city.equals("Стоп"))
                break;

            switch (city){
                case "Москва" :
                case "Калининград" :
                case "Ростов" :
                    System.out.println("Россия");
                    break;

                case "Милан" :
                case "Рим" :
                case "Турин" :
                    System.out.println("Италия");
                    break;

                case "Кельн" :
                case "Гамбург" :
                case "Берлин" :
                    System.out.println("Германия");
                    break;

                case "Ливерпуль" :
                case "Манчестер :" :
                case "Лондон" :
                    System.out.println("Англия");
                    break;

                default:
                    System.out.println("Неизвестная страна");

            }
        }

    }
}
