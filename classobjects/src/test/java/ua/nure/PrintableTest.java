package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PrintableTest {

    @Test
    void print() {
        Printable printer = message -> System.out.println(message);
        printer.print("hello");
        printer.printTwics("world");
        Printable printer2 = message ->{
            System.out.println(message+" world");
            System.out.println(message+" world2");
        };
        printer2.print("hello");
        printer2.printTwics("hello");

        PrintableImpl printer3 = new PrintableImpl();
        printer3.print("hello");
    }
}