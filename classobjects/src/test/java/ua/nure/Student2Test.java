package ua.nure;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class Student2Test {

    @Test
    void runExample() {
        Student2 student2 = new Student2("Roman" ,323);
        log.info(student2.toString());

        Person person = new Person("Roma", 33);
        log.info(person.toString());


    }
}