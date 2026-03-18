package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TrafficLightTest {

    @Test
    void runExampleTest() {
        TrafficLight r = TrafficLight.YELLOW;
        System.out.println(r.toString());
        for (TrafficLight l : TrafficLight.values()) {
            System.out.println(l.toString());
            System.out.println(l.name());
        }
    }
    @Test
    void runExampleSwitchTest() {


        TrafficLight light = TrafficLight.RED;
        light.displayMessage();         // Виклик перевизначеного методу
        light.turnOn();                 // Виклик методу з інтерфейсу
        System.out.println("Тривалість: " + light.getDuration() + " секунд");

        TrafficLight nextLight = TrafficLight.getNextLight(light);  // Статичний метод
        System.out.println("Наступне світло: " + nextLight);

        // Використання вкладеного класу
        TrafficLight.Controller controller = new TrafficLight.Controller();
        controller.switchLight(TrafficLight.GREEN);
        assertEquals(TrafficLight.YELLOW, nextLight);
    }
}