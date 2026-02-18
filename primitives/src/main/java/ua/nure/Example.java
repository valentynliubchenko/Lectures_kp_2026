package ua.nure;

public class Example {
    public static int staticVar = 10;  // Класова змінна
    public int instanceVar = 20;   // Змінна екземпляра

    public void method() {
        int localVar = 30;       // Локальна змінна
        System.out.println("localVar: " + localVar);
        int localVar2 = 40;
        System.out.println("localVar2: " + localVar2);
        double b = 3.14;
        System.out.println("b: " + b);
        b = localVar2;
        System.out.println("b: " + b);
        localVar2 = (int)b;
        boolean isActive = true;
        System.out.println("localVar2: " + localVar2);
    }

}
