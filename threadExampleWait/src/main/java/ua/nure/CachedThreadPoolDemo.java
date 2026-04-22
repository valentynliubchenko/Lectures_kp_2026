package ua.nure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newCachedThreadPool();

        //  запускаємо багато задач
        for (int i = 1; i <= 100; i++) {
            int taskId = i;
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
            executor.submit(() -> {
                System.out.println(
                        "Task " + taskId +
                                " executed by " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}