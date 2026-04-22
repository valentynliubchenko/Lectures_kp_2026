package ua.nure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemoStep1 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 15; i++) {
            int taskId = i;

            executor.submit(() -> {
                System.out.println(
                        "Task " + taskId +
                                " executed by " + Thread.currentThread().getName()
                );
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executor.shutdown();
        System.out.println("Finish");
        try {
            if (!executor.awaitTermination(1000, TimeUnit.DAYS))
            {
                System.out.println("Не всі задачі виконані");
                executor.shutdownNow();
            };
        } catch (InterruptedException e) {
            executor.shutdownNow();
            System.out.println("Unknown exception");
        }

        System.out.println("Finish2");
    }
}
