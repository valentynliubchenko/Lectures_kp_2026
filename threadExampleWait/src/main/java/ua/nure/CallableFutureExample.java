package ua.nure;

import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Callable, що повертає результат
        Callable<Integer> task = () -> {
            System.out.println("Calculating...");
            TimeUnit.SECONDS.sleep(2);  // Імітація складних обчислень
            return 42;
        };

        // Відправка задачі на виконання і отримання Future
        Future<Integer> future = executor.submit(task);

        try {
            // Виконуємо інші операції, поки задача виконується
            System.out.println("Doing other work...");

            // Отримуємо результат (блокуємо потік до завершення задачі)
            Integer result = future.get();
            System.out.println("Result: " + result);

            // Можна також вказати таймаут для очікування
            // Integer result = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
