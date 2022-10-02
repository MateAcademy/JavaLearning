package com.learning.lessons.lesson00.ex_004_lambdaCalculate.ex2;


/**
 * @author Sergey Klunniy
 */
public class Main {
    int i = 10;
    public static void main(String[] args) {


        User user1 = new User() {
            int i = 20;

            @Override
            public void print(int i) {
            }
        };


        User user2 = (i)-> {
//            int i = 20;
            System.out.println();
        };

//показать что в лямбду я не могу передать переменную i
    }
}

@FunctionalInterface
interface User {
    void print(int i);
}
