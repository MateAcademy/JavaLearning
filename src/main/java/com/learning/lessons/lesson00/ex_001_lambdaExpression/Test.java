package com.learning.lessons.lesson00.ex_001_lambdaExpression;

import java.util.function.IntPredicate;
import java.util.function.LongUnaryOperator;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) {
        IntPredicate i = x -> {
            System.out.println();
            boolean r = true;
            return r;
        };

        boolean rez = i.test(4);
        System.out.println(rez);


        LongUnaryOperator lu = (x) -> x * 2;
    }
}
