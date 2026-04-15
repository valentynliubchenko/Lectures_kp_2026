package ua.nure;

public class SimpleWaitNotifyExample {
    private boolean messageReady = false;
    private String message;

    // Метод для відправлення повідомлення
    public synchronized void sendMessage(String message) {
        this.message = message;
        messageReady = true;
        notify();// Повідомляємо споживача, що дані готові
    }

    // Метод для отримання повідомлення
    public synchronized String receiveMessage() throws InterruptedException {
// Цикл while захищає від "помилкових пробуджень"
        while (!messageReady) {
            wait();// Чекаємо, поки повідомлення не буде готове
        }
        messageReady = false;// Скидаємо стан
        return message;
    }
}
