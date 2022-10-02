package com.stream.ex0005.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 Optional 1.8 он является final
 * показать исходники
*/
public class OptionalValues {

    private static List<Person> people = new ArrayList<>();

    static {
        people.add(new Person("Bill"));
    }

    public static void main(String[] args) {
        Optional<Person> maybePerson = getPersonByName("Bill");

        if (maybePerson.isPresent()) {
            System.out.println("Person was found");
        } else {
            System.out.println("Person was not found");
        }
    }

    public static Optional<Person> getPersonByName(String name) {
        for (Person p : people) {
            if (p.getName().equals(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}