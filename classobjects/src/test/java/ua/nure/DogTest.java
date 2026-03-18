package ua.nure;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class DogTest {

    @Test
    void runDogExample() {
        Dog dog =new Dog("my dog");
        dog.breathe();
        dog.play();
        dog.eat();
        log.info("{}", dog);
    }
}