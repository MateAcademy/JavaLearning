package com.learning.lessons.lesson00;



import java.util.function.IntBinaryOperator;

/**
 * @author Sergey Klunniy
 */
public class Main {

    static int a = 5;

    public static void main(String[] args) {
        int p = 10;
        Executable e = (r, t) -> {
            a = 55 + p;

            return r + t;
        };


    }
}


interface Executable {
    int execute(int a, int b);
}

//class Runner implements Executable{
//    @Override
//    public void execute() {
//        System.out.println("HELLO");
//    }
//}
