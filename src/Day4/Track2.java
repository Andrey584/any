package Day4;

import java.util.Arrays;
import java.util.Random;

class Track2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[100];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10000);
        }
        int max = 0;
        for (int element : arrays) {
            if (element > max)
                max = element;
        }
        System.out.println(max);

        int min = 10000;
        for (int element : arrays) {
            if (element < min)
                min = element;
        }
        System.out.println(min);

        int counter = 0;
        for (int element : arrays){
            if(element%10==0)
                counter++;
        }
        System.out.println(counter);

        int sum = 0;
        for(int element : arrays){
            if(element%10==0)
                sum += element;
        }
        System.out.println(sum);


    }
}
