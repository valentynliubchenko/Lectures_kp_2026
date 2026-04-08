package ua.nure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 7, 5, 2));

        // Сортування
        Collections.sort(numbers);
        System.out.println("Відсортований список: " + numbers);

        // Зворотнє сортування
        Collections.reverse(numbers);
        System.out.println("Зворотній порядок: " + numbers);

        // Перемішування
        Collections.shuffle(numbers);
        System.out.println("Перемішаний список: " + numbers);

        // Мінімальне і максимальне значення
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Мін: " + min + ", Макс: " + max);

        // Заповнення
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.fill(list, "Xукеуке");
        System.out.println("Заповнений список: " + list);

        // Незмінні колекції
        List<String> immutableList = Collections.unmodifiableList(
                new ArrayList<>(Arrays.asList("A", "B", "C"))
        );
        // immutableList.add("D");  // Викине UnsupportedOperationException

        // Синхронізовані колекції
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
    }
}
