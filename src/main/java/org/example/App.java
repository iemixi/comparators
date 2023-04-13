package org.example;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("name", "name name", 12),
                new Person("name", "name name name", 1),
                new Person("name", "name name", 18),
                new Person("name", "name name", 12),
                new Person("name", "name name", 13),
                new Person("name", "name name", 15),
                new Person("name", "name name", 19),
                new Person("name", "name name", 20)
        ));

        System.out.println("До удаления:");
        for (Person person : persons) {
            System.out.println(person);
        }

        persons.removeIf(person -> person.getAge() < 18);

        System.out.println("\nПосле удаления");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
