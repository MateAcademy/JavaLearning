package com.learning.lessons.lesson00;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) {
        String[] testString = {"one, two, three, four"};

//        Arrays.sort(testString, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });


        //Arrays.sort(testString, (a, b) -> a.length() - b.length());

        Arrays.sort(testString, Comparator.comparingInt(String::length));




    }


}
