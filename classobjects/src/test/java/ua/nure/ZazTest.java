package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ZazTest {

    @Test
    void start() {
        Zaz zaz = new Zaz();
        zaz.start();
        zaz.honk();
    }
}