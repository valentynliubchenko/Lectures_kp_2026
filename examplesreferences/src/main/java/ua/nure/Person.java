package ua.nure;

public class Person {
    //private  String name;
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
    public Person withName(String name) {
        return new Person(name);
    }

}
