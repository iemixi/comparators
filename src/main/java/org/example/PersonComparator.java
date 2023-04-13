package org.example;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    public int compare(Person first, Person second) {
        int firstWordsAmount = first.getSurname().split(" ").length;
        int secondWordsAmount = second.getSurname().split(" ").length;

        if (firstWordsAmount == secondWordsAmount) {
            return first.getAge() - second.getAge();
        }

        return firstWordsAmount - secondWordsAmount;
    }
}
