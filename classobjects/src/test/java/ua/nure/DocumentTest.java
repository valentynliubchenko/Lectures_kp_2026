package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DocumentTest {

    @Test
    void print() {
        Document document = new Document("Title", "Content");
        document.print("Hello");
    }
}