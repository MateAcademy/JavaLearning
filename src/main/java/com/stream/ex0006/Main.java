package com.stream.ex0006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {

//Похож на map но может создавать из одного элемента несколько

//на выход из flatMap мне нужен список элементов в виде стрима
//ты можешь привести какой-то пример для чего это нужно?
//представь что есть программа для универа, подводятся итооове рейтинговые балы
        List<String> collection = new ArrayList<>();
        collection.add("hello,world");
        collection.add("track");

        String[] str = collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);

        System.out.println(Arrays.toString(str));

        ArrayList<Object> objects = new ArrayList<>();
        //ctrl + alt + v

    }
}
