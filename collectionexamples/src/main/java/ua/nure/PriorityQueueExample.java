package ua.nure;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Створення пріоритетної черги (за замовчуванням - натуральний порядок)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Додавання елементів
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);

        // Отримання першого елемента (з найвищим пріоритетом)
        System.out.println("Перший елемент: " + priorityQueue.peek());  // 5

        // Видалення та отримання елементів за пріоритетом
        System.out.println("Елементи за пріоритетом:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // Пріоритетна черга з власним компаратором
        Queue<String> stringQueue =
                new PriorityQueue<>((s1, s2) -> s1.length() - s2.length());
        stringQueue.add("Яблуко");
        stringQueue.add("Грука");
        stringQueue.add("Апельсин");

        System.out.println("Слова за довжиною (від найдовшого):");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
