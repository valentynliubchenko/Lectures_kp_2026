package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SingletonTest {

    @Test
    void getValue() {
        Singleton.INSTANCE.setValue(42);
        int value = Singleton.INSTANCE.getValue();
        assertEquals(42, value);
    }
}