package theard;

import java.util.Scanner;

public class Test {
    private static int counter;
    public static void main(String[] args) {
       Test.doWork();

    }
    public static void increment(){
        Test test1 = new Test();
        Test test2 = new Test();
        synchronized (test1) {
            counter++;
        }
        synchronized (test2){
            counter++;
        }
    }
    public static void doWork(){
        Thread theard1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; counter<10000; i++){
                    increment();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; counter<10000; i++){
                    increment();
                }
            }
        });
        theard1.start();
        thread2.start();
        try {
            theard1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);

    }
}


