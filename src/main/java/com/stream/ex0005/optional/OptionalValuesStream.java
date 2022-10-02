package com.stream.ex0005.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class OptionalValuesStream {

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
        // Much shorter implementation of getPersonByName
        return people.stream().filter(p -> name.equals(p.getName())).findFirst();
    }
}