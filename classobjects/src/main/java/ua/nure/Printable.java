package ua.nure;
@FunctionalInterface
public interface Printable {
    void print(String message);
    default void printTwics(String message) {
        print(message);
        print(message);
    }
}
