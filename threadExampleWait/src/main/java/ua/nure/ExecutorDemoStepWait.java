package ua.nure;

import java.util.concurrent.*;

public class ExecutorDemoStepWait {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 15; i++) {
            int taskId = i;

            executor.submit(() -> {
                System.out.println(
                        "Task " + taskId +
                                " executed by " + Thread.currentThread().getName()
                );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executor.shutdown(); // більше не приймаємо задачі

        try {
            // чекаємо максимум 5 секунд
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Не всі задачі завершились вчасно — форсимо shutdownNow()");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread завершився");
    }
}