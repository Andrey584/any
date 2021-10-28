package Day4;

import java.util.Random;

class Track3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrays = new int[12][8];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(50);
            }
        }
        int sum = 0;
        int maxSum = 0;
        int idx = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                idx = i;

            }


        }
        System.out.println(maxSum);
        System.out.println(idx);
    }
}