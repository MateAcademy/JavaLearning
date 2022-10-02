package com.learning.lessons.lesson00.ex_004_lambdaCalculate.printAge;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        long l1 = System.nanoTime();
        User user1 = new User() {
            @Override
            public void print() {
                System.out.println("11 age");
            }
        };
        long l2 = System.nanoTime();

        long l3 = System.nanoTime();
        User user2 = ()-> System.out.println("Hello");
        long l4 = System.nanoTime();

        System.out.println(l2-l1);
        System.out.println(l4-l3);

        System.out.println(user1);
        System.out.println(user2);
        //toString getClass genName@ hashcode и преводится с двоичной сист счисления в 16
    }
}

@FunctionalInterface
interface User {
    void print();
}
