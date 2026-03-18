package ua.nure;

public interface Vehicle {
    void start();
    default void honk() {
        System.out.println("Beep beep!");
    }

}
