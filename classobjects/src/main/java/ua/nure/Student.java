package ua.nure;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
public class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public Student(String name, int age) {
        this(name, age, "Not assigned");
    }


    public Student() {
        this("Unknown", 0);
    }
    public Student(Student student) {
        this(student.name, student.age, student.course);
    }


}
