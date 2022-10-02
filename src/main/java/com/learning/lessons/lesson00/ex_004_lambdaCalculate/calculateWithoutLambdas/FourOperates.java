package com.learning.lessons.lesson00.ex_004_lambdaCalculate.calculateWithoutLambdas;

/**
 * @author Sergey Klunniy
 */
public class FourOperates {


    public static void main(String[] args) {

        Operation2 add = (x, y) -> x + y;
        Operation2 sub = (x, y) -> x - y;
        Operation2 multiple = (x, y) -> x * y;
        Operation2 div = (x, y) -> x / y;

        int resultAdd = add.calculate(20, 10);
        int resultSub = sub.calculate(20, 10);
        int resultMultiple = multiple.calculate(20, 10);
        int resultDiv = div.calculate(20, 10);

        System.out.println(resultAdd); // 30
        System.out.println(resultSub); // 30
        System.out.println(resultMultiple); // 30
        System.out.println(resultDiv); // 30
    }
}


@FunctionalInterface
interface Operation2 {
    int calculate(int x, int y);
}
