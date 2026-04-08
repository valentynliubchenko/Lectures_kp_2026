package ua.nure;

public class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread started " +
                Thread.currentThread().getName());
    }
}
