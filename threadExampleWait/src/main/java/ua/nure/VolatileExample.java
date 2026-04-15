package ua.nure;

public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!flag) {
                System.out.println("Run Thread");
                // Цикл буде припинено, коли flag зміниться на true
            }
            System.out.println("Flag is true, exiting!");
        });

        thread.start();

        Thread.sleep(1000);  // Почекати 1 секунду
        flag = true;  // Зміна буде видима для другого потоку
        System.out.println("Flag set to true");
    }
}
