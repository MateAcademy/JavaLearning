package com.stream.ex0003;

import java.util.function.IntBinaryOperator;

/**
 * @author Sergey Klunniy
 * а если мне нужна какая-то кастомная логика, я всеравно придумаю свой?
 * TODO: например что можно придумать?
 */
public class Main {
    public static void main(String[] args) {
        // (a, b)- > a+b;
        // вот здесь мы именно обращаемся к классу Integer, вызываем статический метод
        IntBinaryOperator i = Integer::sum;

        int result = i.applyAsInt(5, 6);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Test {
    int add(int a, int b);
}
