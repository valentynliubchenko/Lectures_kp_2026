package ua.nure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str = "Hello";
        if (str != null) {
             System.out.println("str is not null");
        }

        str = null;
        if (str == null){
            System.out.println("str is null");
        }

        Integer i = 100;

        if (i != null){
            System.out.println("i is not null");
        }

        i = null;
        if (i == null){
            System.out.println("i is null");
        }
    }
}
