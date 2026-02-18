package ua.nure;

public class AppExample {
    public static void main(String[] args) {
        Example example = new Example();
        Example example1 = new Example();
        example.method();
        example1.instanceVar = 10;
        example.instanceVar = 20;
        System.out.println("instanceVar: " + example.instanceVar);
        System.out.println("instanceVar: " + example1.instanceVar);
        example1.staticVar = 123;
        System.out.println("staticVar: " + example.staticVar);
        System.out.println("staticVar: " + example1.staticVar);
        System.out.println("staticVar: " + Example.staticVar);
    }
}
