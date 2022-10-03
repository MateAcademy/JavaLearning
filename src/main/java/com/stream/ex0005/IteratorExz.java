package com.stream.ex0005;

import java.util.stream.Stream;

/**
 * @author Sergey Klunniy
 * в итератор генерирует бесконечный поток, мы можем передавать рандомные значения потом лимитом ограничиваем 10 значений
 */
public class IteratorExz {
    public static void main(String[] args) {
        Stream.iterate(5, t->t++).limit(10).forEach(System.out::println);
        Stream.iterate(5, t->t<10, t->t++).forEach(System.out::println);
    }
}
