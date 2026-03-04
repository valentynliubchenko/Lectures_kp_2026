package ua.nure;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) throws IOException {
//// Отримуємо доступ до консолі
//        Console cons = System.console();
//        if (cons == null) {
//            System.out.println("Консоль не доступна.");
//            return;
//        }
//        // Читання рядка з консолі
//        String name = cons.readLine("Введіть своє ім'я: ");
//        System.out.println("Привіт, " + name + "!");
//        // Читання пароля (без відображення введених символів)
//        char[] passwordArray = cons.readPassword("Введіть пароль: ");
//        System.out.println("Пароль прийнято.");
//        // Перетворення масиву символів в рядок
//        String password = new String(passwordArray);
//        System.out.println("Ваш пароль: " + password);
//        System.out.printf("%d, ", password.length());


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть своє ім'я:");
        String name = reader.readLine();
        System.out.println("Введіть свій вік:");
        String ageStr = reader.readLine();
        int age = Integer.parseInt(ageStr);
        System.out.println("Привіт, " + name + "! Тобі " + age + " років.");
        reader.close(); // Закриваємо BufferedReader після використання


    }
}
