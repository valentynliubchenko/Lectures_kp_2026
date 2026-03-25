package ua.nure;

import java.util.Arrays;

public class AppUtility {
    public static void main( String[] args )
    {
        Utility obj = new Utility();
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(intArray));
        obj.swap(intArray, 1, 5);
        System.out.println(Arrays.toString(intArray));
    }
}
