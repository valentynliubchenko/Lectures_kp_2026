package ua.nure;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
        log.info("Person created");
    }

    public Person(String n, Integer a) {
        this.name = n + " " +a;
        log.info("Person created");
    }

    //    public Person() {
//        this.name = "Roman";
//        log.info("Person created def");
//    }

}
