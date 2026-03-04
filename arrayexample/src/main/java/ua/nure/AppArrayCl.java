package ua.nure;

import java.util.Arrays;
import java.util.Comparator;

public class AppArrayCl {
    public static void main(String[] args) {
        // Приклад масиву
        int[] numbers = {5, 3, 8, 1, 2};
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        // 1. Сортування масиву
        Arrays.sort(numbers); // Сортує масив чисел
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        // 2. Заповнення масиву
     //   Arrays.fill(numbers, 0); // Заповнює масив значенням 0
        System.out.println("Filled numbers: " + Arrays.toString(numbers));
        // 3. Копіювання частини масиву
        int[] copiedNumbers = Arrays.copyOfRange(numbers, 1, 5);
        System.out.println("Copied numbers (from index 1 to 3): " + Arrays.toString(copiedNumbers));
        // 4. Порівняння масивів
        int[] anotherNumbers = {0, 0, 0, 0, 0};
        System.out.println("Arrays are equal: " + Arrays.equals(numbers, anotherNumbers));
        // 5. Пошук в масиві (якщо масив відсортований)
        int index = Arrays.binarySearch(numbers, 2); // Бінарний пошук значення 2
        System.out.println("Index of 2: " + index);
        // 6. Сортування масиву за допомогою компаратора
        Arrays.sort(names, Comparator.reverseOrder()); // Сортує масив строк у зворотньому порядку
        System.out.println("Sorted names in reverse order: " + Arrays.toString(names));
        // 7. Перетворення масиву в список
        System.out.println("Names as list: " + Arrays.asList(names));

        // 8. Глибоке порівняння масивів (для багатовимірних масивів)
        int[][] multiDimArray = {{1, 2}, {3, 4}};
        int[][] anotherMultiDimArray = {{1, 2}, {3, 4}};
        System.out.println("Multidimensional arrays are equal: " + Arrays.deepEquals(multiDimArray, anotherMultiDimArray));

        // 9. Перетворення масиву в стрічку
        System.out.println("Names as string: " + Arrays.toString(names));
    }
}
