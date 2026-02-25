package ua.nure;

public class AppStringsBuilderCamelCase {
    public static void main(String[] args) {
        String input = "hello    world    java     prograMMing";
        System.out.println("Оригінальний рядок: " + input);
        System.out.println("Хешкод оригінального рядка: " + Integer.toHexString(input.hashCode()));

        // Використовуємо StringBuilder для побудови результату
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");   // Розбиваємо по пробілах

        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase())  // Перша буква в верхній регістр
                    .append(word.substring(1).toLowerCase());     // Решта в нижньому регістрі

            // Виводимо проміжний результат і хешкод після кожної ітерації
            System.out.println("Проміжний результат: " + result.toString());
            System.out.println("Хешкод після ітерації: " + Integer.toHexString(result.hashCode()));
        }

        // Виводимо фінальний результат та хешкод
        System.out.println("Фінальний результат: " + result.toString());
        System.out.println("Фінальний хешкод: " + Integer.toHexString(result.hashCode()));
    }
}
