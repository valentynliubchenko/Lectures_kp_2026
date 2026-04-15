package ua.nure;

import java.util.concurrent.ConcurrentHashMap;

public class AppConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.merge("count", 1, Integer::sum);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        // чекаємо завершення потоків
        t1.join();
        t2.join();

        // демонстрація результату
        System.out.println("Final count: " + map.get("count"));
    }
}
