package com.stream.ex0003;

import java.util.function.IntBinaryOperator;

/**
 * @author Sergey Klunniy
 * а если мне нужна какая-то кастомная логика, я всервно придумаю свой?
 */
public class Main {
    public static void main(String[] args) {
        // (a, b)- > a+b;
        // вот здесь мы именно обращаемся к классу интежер, вызываем статический метод
        IntBinaryOperator i = Integer::sum;

        int i1 = i.applyAsInt(5, 6);
        System.out.println(i1);
    }
}

@FunctionalInterface
interface Test {
    int add(int a, int b);
}
