package ua.nure;

import org.w3c.dom.ls.LSOutput;

public class AppExampleObject {
    public static void main(String[] args) {
        Object object = new Object();
        ExampleObject exampleObject = new ExampleObject(1);
        Object object2 =  new ExampleObject(1);
        System.out.println(exampleObject);
        System.out.println(exampleObject.toString());
        System.out.println(exampleObject.hashCode());
        System.out.println(Integer.toHexString(exampleObject.hashCode()));
        System.out.println(exampleObject.getClass());
    }

}
