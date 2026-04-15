package ua.nure;



public class AppSimpleWaitNotifyExample {

    public static void main(String[] args) {
        SimpleWaitNotifyExample example = new SimpleWaitNotifyExample();

// Потік-споживач
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Споживач: чекаю на повідомлення...");
                String receivedMessage = example.receiveMessage();
                System.out.println("Споживач: отримав повідомлення — " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

// Потік-виробник
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(2000);// Симулюємо роботу
                System.out.println("Виробник: відправляю повідомлення");
                example.sendMessage("Привіт від виробника!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        producer.start();
    }
}
