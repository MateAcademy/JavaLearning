package com.stream.ex0002;

import java.util.function.*;

/**
 * Что такое лямбда выражение?
 * Лямбда выражение это сокращенная запись для интерфейса который имеет один абстрактный метод.
 *
 * Потому что подобная запись подразумевает, что ты создаёшь реализацию для метода единственного
 * в некоем интерфейсе, который на вход принимает два объекта (в твоём случае типа Integer) и возвращает объект тоже типа Integer
 *
 * Чем Consumer отличается от Function?
 *
 * <p>
 * Predicate<T> - аргумент Т, возвращает boolean,           boolean test(T t);
 * Function<T,R> - аргумент Т, возвращает R                 R apply(T t);
 * Consumer<T> - аргумент Т, ничего не возвращает(void)     void accept(T t);
 * Supplier<T> - нет аргументов, возвращает Т.               T get();
 * BinaryOperator<T> - два аргумента Т и Т, возвращает Т
 * <p>
 * IntPredicate
 * LongUnaryOperator
 * DoubleBinaryOperator
 */
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> a = o -> o > 5;
        System.out.println(a.test(10));

        // Creates predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));

        Function<Integer, String> function = String::valueOf;
        String s = function.apply(10);

// Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(56);

// Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:
        Supplier<Integer> supplier = () -> 5;
        System.out.println(supplier.get());

        BinaryOperator<Integer> bin = Integer::sum;
        System.out.println(bin.apply(5, 5));

// BinaryOperator<T> принимает в качестве параметра два объекта типа T, выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T:
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(5, 5));

//TODO: Подойдет ли этот пример?
        BiFunction<String, Integer, String> biFunction = (a2 , b2) -> a2 + b2;
        String apply = biFunction.apply("5", 5);
        System.out.println(apply);

//TODO: Подойдет ли этот пример этот?
        BiConsumer<String, String> biConsumer = (a3, b3) -> System.out.println(a3 + b3);

//TODO: А есть ли еще интерфейсы с приставкой BI?


//ЗАДАЧА: а напиши пример с IntBinaryOperator:
        IntBinaryOperator i = Integer::sum;

        UnaryOperator<String> unaryOperator =  t -> t;
        Function<String, Integer> function1 = Integer::valueOf;

    }
}
