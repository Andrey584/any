package Day4;

import java.util.Random;

class Track4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[100];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10000);
        }
        int sum = 0;
        int maxSum = 0;
        int idx = 0;

        for (int i = 0; i < arrays.length - 2; i++) {
            for(int j = i; j < i + 3; j++) {
                sum += arrays[j];
            }
                if(sum>maxSum){
                    maxSum = sum;
                    idx = i;
                }
        }

        System.out.println(maxSum);
        System.out.println(idx);
    }
}
