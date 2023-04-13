package org.example;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("name", "name name", 12),
                new Person("name", "name name name", 1),
                new Person("name", "name name", 12),
                new Person("name", "name name", 13),
                new Person("name", "name name", 15)
        ));

        System.out.println("До сортировки:");
        for (Person person : persons) {
            System.out.println(person);
        }

        persons.sort(new PersonComparator().reversed());

        System.out.println("\nПосле сортировки:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
