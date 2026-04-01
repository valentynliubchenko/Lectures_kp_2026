package ua.nure;

import java.util.*;
import java.util.stream.Collectors;

public class SetStreamExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "яблуко", "банан", "апельсин", "яблуко", "груша",
                "банан", "ківі", "манго", "апельсин"
        );

        // Отримання унікальних елементів
        Set<String> uniqueWords = words.stream()
                .collect(Collectors.toSet());
        System.out.println("Унікальні слова: " + uniqueWords);
        System.out.println(uniqueWords.getClass());
        System.out.println(uniqueWords.getClass().getName());


        // Отримання відсортованих унікальних елементів
        Set<String> sortedUniqueWords = words.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Відсортовані унікальні слова: " + sortedUniqueWords);

        System.out.println(sortedUniqueWords.getClass());
        System.out.println(sortedUniqueWords.getClass().getName());


        // Фільтрація, мапування та збір у Set
        Set<String> filteredWords = words.stream()
                .filter(w -> w.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println("Відфільтровані слова: " + filteredWords);

        // Перетворення елементів List у Set з власним обробником
        Set<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Унікальні довжини слів (відсортовані): " + wordLengths);
    }
}
