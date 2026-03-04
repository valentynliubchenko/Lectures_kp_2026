package ua.nure;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ExampleReadFile {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            writer.printf("Число: %d, Рядок: %s\n", 42, "Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
