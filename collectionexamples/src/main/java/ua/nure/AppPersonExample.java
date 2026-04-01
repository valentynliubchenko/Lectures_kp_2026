package ua.nure;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class AppPersonExample
{
    public static void main( String[] args )
    {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Іван", "Петров", 28));
        people.add(new Person("Марія", "AКоваленко", 32));
        people.add(new Person("Олександр", "Шевченко", 25));
        people.add(new Person("Анна", "Мельник", 30));
        people.add(new Person("Петро", "Іваненко", 42));

// Виводимо всіх людей (будуть відсортовані за прізвищем)
        System.out.println("Список людей (відсортований):");
        for (Person person : people) {
            System.out.println(person);
        }

        /// ///////////
        // Сортування за віком
        Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Set<Person> peopleByAge = new TreeSet<>(ageComparator);

// Додавання елементів
        peopleByAge.add(new Person("Іван", "Петров", 28));
        peopleByAge.add(new Person("Марія1", "Коваленко", 312));
        peopleByAge.add(new Person("Марія2", "Коваленко", 33));
        peopleByAge.add(new Person("Марія3", "Коваленко", 432));
        peopleByAge.add(new Person("Марія4", "Коваленко", 332));

        System.out.println("Список людей (відсортований2):");
        for (Person person : peopleByAge) {
            System.out.println(person);
        }

// ...

// Сортування за ім'ям
        Comparator<Person> nameComparator = Comparator.comparing(Person::getFirstName);
        Set<Person> peopleByName = new TreeSet<>(nameComparator);
        peopleByName.add(new Person("Іван", "Петров", 28));
        peopleByName.add(new Person("АМарія1", "Коваленко", 312));
        peopleByName.add(new Person("ФМарія2", "Коваленко", 33));
        peopleByName.add(new Person("Марія3", "Коваленко", 432));
        peopleByName.add(new Person("УМарія4", "Коваленко", 332));

        System.out.println("Список людей (відсортований3):");
        for (Person person : peopleByName) {
            System.out.println(person);
        }

// Складне сортування (за прізвищем, потім за ім'ям)
        Comparator<Person> fullNameComparator = Comparator
                .comparing(Person::getLastName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getAge);
        Set<Person> peopleByFullName = new TreeSet<>(fullNameComparator);
        peopleByFullName.add(new Person("Іван", "Петров", 28));
        peopleByFullName.add(new Person("Марія1", "AКоваленко", 312));
        peopleByFullName.add(new Person("AМарія2", "Коваленко", 33));
        peopleByFullName.add(new Person("Марія3", "Коваленко", 432));
        peopleByFullName.add(new Person("Марія3", "Коваленко", 332));

        System.out.println("Список людей (відсортований3):");
        for (Person person : peopleByFullName) {
            System.out.println(person);
        }

    }
}
