package Day4;



import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Track1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arrays = new int[x];
        int counter8 = 0;
        int counter1 = 0;
        int chet = 0;
        int unchet = 0;
        int sum = 0;

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10);
            if (arrays[i] > 8)
                counter8++;
            if(arrays[i]==1)
                counter1++;
            if(arrays[i]%2==0)
                chet++;
            if(arrays[i]%2!=0)
                unchet++;
            sum += arrays[i];

        }



        System.out.println(Arrays.toString(arrays));
            System.out.println("Длина массива " + arrays.length);
            System.out.println("Чисел более восьми: " + counter8);
        System.out.println("Чисел равных единицы: "+counter1);
        System.out.println("Кол-во четных чисел "+ chet);
        System.out.println("Кол-во нечетных чисел " + unchet);
        System.out.println("Сумма всех чисел массива :" + sum);




    }
}




