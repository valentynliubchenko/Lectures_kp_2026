package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void surfaceGravity() {
        double mass = 70.0;
        // 1. Використання конкретного enum-значення
        Planet earth = Planet.EARTH;
        // 2. Виклик методу surfaceGravity()
        System.out.println("Гравітація на Earth: " + earth.surfaceGravity());
        // 3. Виклик методу surfaceWeight(double)
        System.out.println("Вага тіла 70 кг на Earth: " + earth.surfaceWeight(mass));
        System.out.println();
        // 4. Використання values() - пройтись по всіх планетах
        for (Planet planet : Planet.values()) {
            System.out.println(
                    planet + " -> gravity: " + planet.surfaceGravity()
                            + ", weight: " + planet.surfaceWeight(mass)
            );
        }
    }
}