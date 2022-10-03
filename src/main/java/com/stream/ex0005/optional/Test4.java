package com.stream.ex0005.optional;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Опшинал - это замена по факту значения null
 */
public class Test4 {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.empty();
//      Optional<Integer> opt2 = Optional.of(null);
        Optional<Integer> opt2 = Optional.of(10);
        Optional<Integer> opt3 = Optional.ofNullable(null);

        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);

        String str;
        if (getString().isPresent()) {
            //str = getString().get();
//todo:
            str = getString().orElseGet(String::new);
        }

        str = getString().orElseThrow(null);
        Stream.of(str).forEach(System.out::println);

        boolean aNull = Objects.isNull(null);
        System.out.println(aNull);
    }

    private static Optional<String> getString() {
        if (true) {
            return Optional.of("Simple value");
        } return Optional.empty();
    }
}
