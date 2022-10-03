package com.stream.ex0002;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Чем Consumer отличается от Function?
 */
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> a = o -> o > 5;
        System.out.println(a.test(10));

        // Creates predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));

        Function<Integer,String> function = String::valueOf;
        String s = function.apply(10);

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(56);

        Supplier<Integer> supplier = ()-> 5;
        System.out.println(supplier.get());

    }
}
