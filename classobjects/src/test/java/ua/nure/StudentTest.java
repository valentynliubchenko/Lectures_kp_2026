package ua.nure;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class StudentTest {

    @Test
    void runExample() {
        Student s = new Student();
        log.info("{}", s);


        Student s2 = new Student("Mykola", 7);
        log.info("{}", s2);

        Student s22 = new Student("Mykola", 7, "Math");
        log.info("{}", s22);



        Student s3 = new Student(s2);
        log.info("{}", s3);

    }
}