package ua.nure;

public class DeadlockExample {
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (LOCK_1) {
                System.out.println("Thread 1: Holding LOCK_1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for LOCK_2");
                synchronized (LOCK_2) {
                    System.out.println("Thread 1: Holding LOCK_1 and LOCK_2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (LOCK_2) {
                System.out.println("Thread 2: Holding LOCK_2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for LOCK_1");
                synchronized (LOCK_1) {
                    System.out.println("Thread 2: Holding LOCK_2 and LOCK_1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
