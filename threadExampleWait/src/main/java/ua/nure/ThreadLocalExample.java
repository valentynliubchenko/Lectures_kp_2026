package ua.nure;

public class ThreadLocalExample {
    // Створюємо ThreadLocal змінну з початковим значенням
    private static final ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            threadLocalValue.set(10);  // Встановлюємо значення для першого потоку
            System.out.println("Thread 1: " + threadLocalValue.get());
        });

        Thread thread2 = new Thread(() -> {
            threadLocalValue.set(20);  // Встановлюємо значення для другого потоку
            System.out.println("Thread 2: " + threadLocalValue.get());
        });

        Thread thread3 = new Thread(() -> {
            threadLocalValue.set(30);  // Встановлюємо значення для другого потоку
            System.out.println("Thread 3: " + threadLocalValue.get());
        });
        Thread thread4 = new Thread(() -> {
            threadLocalValue.set(40);  // Встановлюємо значення для другого потоку
            System.out.println("Thread 4: " + threadLocalValue.get());
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

