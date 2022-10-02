package com.learning.lessons.lesson00;

import java.util.function.*;

/**
 * @author Sergey Klunniy
 */
public class ExeptionEx {


    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (t, u)-> 5 + t + u;
        System.out.println(binaryOperator.apply(1, 2));
    }
}

interface A {
    void a(int a);
}


