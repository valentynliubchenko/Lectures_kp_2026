package ua.nure;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListModificationDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> messages = new CopyOnWriteArrayList<>();

        messages.add("one");
        messages.add("two");

        for (String message : messages) {
            System.out.println(message);

            // змінюємо список під час ітерації
            messages.add("three");
        }

        System.out.println("Final list: " + messages);
    }
}
