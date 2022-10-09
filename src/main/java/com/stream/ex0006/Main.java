package com.stream.ex0006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

//todo: а без слова stream что возвращается?
        String[] strings = collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);

        System.out.println(Arrays.toString(strings));

        ArrayList<Object> objects = new ArrayList<>();
        //ctrl + alt + v
    }
}

class T {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("hello,world");
        collection.add("track");

        //map - Преобразует каждый элемент стрима

        //flatMap - Похоже на map, но может создавать из одного элемента несколько
        List<String> collect = collection.stream().flatMap(t -> (Arrays.stream(t.split(",")))).collect(Collectors.toList());
        System.out.println(collect);
    }
}
