package com.stream.ex007;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class T {

    List<Integer> list = new ArrayList<>();
    {
        list.add(5);
        list.add(6);
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("5", "5", "7"));
        list1.add("hello");

        List<String> list2 = Arrays.asList("5", "5", "7");
        //list2.add("hello");

        List<String> list3 = List.of("5", "5", "7");
//        list3.add("admin");
//        list3.add("root");

        List<String> list5 = new ArrayList<>() {{
            add("5");
            add("6");
        }};


    }
}
