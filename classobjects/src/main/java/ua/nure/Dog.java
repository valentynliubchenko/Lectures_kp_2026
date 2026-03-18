package ua.nure;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Dog implements Pet, Mammal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        log.info("breathe");
    }

    @Override
    public void play() {

        log.info("play");
    }

    @Override
    public void eat() {
        log.info("eat");
    }
//
//    @Override
//    public String toString() {
//        return "MyDog{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}

