package ua.nure;

/**
 * Hello world!
 *
 */
public class AppPair
{
    public static void main( String[] args )
    {
        Pair<String, Integer> person = new Pair<>("John", 42);
        System.out.println(person);
        String name = person.getKey();
        Integer age = person.getValue();
        System.out.println("Name: " + name + ", Age: " + age);

        Pair<Integer, Integer> person2 = new Pair<>(555, 42);
        System.out.println(person);
        Integer name2 = person2.getKey();
        Integer age2 = person2.getValue();
        System.out.println("Name: " + name2 + ", Age: " + age2);
    }
}
