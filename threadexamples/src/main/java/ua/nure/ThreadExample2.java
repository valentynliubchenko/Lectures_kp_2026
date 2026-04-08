package ua.nure;

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        // Створюємо об'єкт, що реалізує Runnable
        MyRunnable myRunnable = new MyRunnable();
        // Створюємо потік і передаємо йому об'єкт Runnable
        Thread thread = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        // Запускаємо потік
        thread.start();
        thread.start();
        thread2.start();

        // Код в головному потоці
        for (int i = 0; i < 5; i++) {
            System.out.println("Головний потік: " + i +" " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        thread.join();
    }
}
