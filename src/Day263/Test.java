package Day263;

import java.util.Random;
import java.util.concurrent.*;

public class Test {
    private static int result;
    public static void main(String[] args) {



        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                System.out.println("Начали");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random random = new Random();
                result = random.nextInt(10);

                if (result < 5) {
                    try {
                        throw new Exception("Что-то пошло не так");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("Закончили");
                return result;

            }
        });
        executorService.shutdown();
        try {
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            e.printStackTrace();
            System.out.println(ex.getMessage());
        }


    }
}
