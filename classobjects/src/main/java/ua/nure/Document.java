package ua.nure;

public record Document(String title, String content) implements Printable {
    @Override
    public void print(String message) {
        System.out.println(title + ": " + message);
        System.out.println(content +  ": " + message);
    }
}
