package ua.nure;

import lombok.ToString;

@ToString
public class Student2 extends Person {
    private int studentId;
    public Student2(String name, int studentId) {
        super(name, studentId); // Виклик конструктора батьківського класу
        this.studentId = studentId;
    }
}
