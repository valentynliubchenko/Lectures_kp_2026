package ua.nure;

import java.util.concurrent.*;

public class ScheduledDemo {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(2);

        scheduler.schedule(() ->
                System.out.println("Delayed task"), 1, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() ->
                System.out.println("Periodic task"), 0, 2, TimeUnit.SECONDS);

        scheduler.scheduleWithFixedDelay(() ->
                System.out.println("Fixed delay task"), 0, 1, TimeUnit.SECONDS);

        //  даємо час побачити виконання
        Thread.sleep(7000);

        scheduler.shutdown();
        System.out.println("Scheduler stopped");
    }
}