package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PairTest {

    @Test
    void keyTest() {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        assertEquals("Age", pair.key());
    }
    @Test
    void keyExep() {
//        Pair<String, Integer> pair = new Pair<>(null, 30);
//        System.out.println(pair.key());
        NullPointerException exception = assertThrows(NullPointerException.class, () -> new Pair<>(null, null));
        assertEquals("Key cannot be null", exception.getMessage());
    }

}