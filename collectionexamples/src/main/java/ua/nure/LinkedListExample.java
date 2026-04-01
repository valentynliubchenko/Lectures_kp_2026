package ua.nure;

import java.util.LinkedList;
import java.util.List;
public class LinkedListExample {
    public static void main(String[] args) {
        // Використовуємо інтерфейс List замість конкретної реалізації LinkedList
        List<String> animals = new LinkedList<>();
        // Додавання елементів
        animals.add("Лев");
        animals.add("Тигр");
        animals.add("Вовк");

        // Для використання специфічних методів
        // LinkedList потрібно привести до типу LinkedList
        LinkedList<String> linkedAnimals = (LinkedList<String>)animals;

        // Додавання на початок/кінець (специфічні методи LinkedList)
        linkedAnimals.addFirst("Слон");

        linkedAnimals.addFirst("sdfgsdfСлон");
        linkedAnimals.addLast("Жираф");

        // Отримання першого/останнього елемента
        System.out.println("Перший: " + linkedAnimals.getFirst());
        System.out.println("Останній: " + linkedAnimals.getLast());

        // Використання як черги/стека
        linkedAnimals.poll();  // Видаляє перший елемент
        linkedAnimals.push("Ведмідь");  // Додає на початок
        linkedAnimals.pop();  // Видаляє та повертає перший елемент

        System.out.println("Усі тварини:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
