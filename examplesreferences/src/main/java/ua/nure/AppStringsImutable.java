package ua.nure;

public class AppStringsImutable {
    public static void main(String[] args) {
        String input = "hello    world    java     programming";
        System.out.println("Оригінальний рядок: " + input);
        System.out.println("Хешкод оригінального рядка: " + Integer.toHexString(input.hashCode()));

        // Перетворення на CamelCase
        String result = "";
        String[] words = input.split("\\s+");   // Розбиваємо по пробілах

        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(); // Створюємо CamelCase
            System.out.println("Проміжний результат: " + result);
            System.out.println("Хешкод після ітерації: " + Integer.toHexString(result.hashCode()));
        }

        System.out.println("Фінальний результат: " + result);
        System.out.println("Фінальний хешкод: " + Integer.toHexString(result.hashCode()));
    }
}
