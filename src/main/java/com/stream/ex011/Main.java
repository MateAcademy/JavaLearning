package com.stream.ex011;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("7", "4", "4", "5", "3", "2", "3a");
        //stringList.add("7");

//Вернуть количество вхождений объекта «a1»
        long count = stringList.stream().filter(t -> t.equals("3")).count();
        long count2 = stringList.stream().filter("3"::equals).count();
        System.out.println(count2);

//Вернуть первый элемент коллекции или 0, если коллекция пуста
        String s = stringList.stream().findFirst().orElse("0");
        System.out.println(s);

//Вернуть последний элемент коллекции или «empty», если коллекция пуста
        String str = stringList.stream().skip(stringList.size()-1).findFirst().orElse("empty");
        System.out.println(str);

        String str2 = stringList.stream().skip(stringList.size()-1).findAny().orElse("empty");
        System.out.println(str2);

//Найти элемент в коллекции равный «a3» или кинуть ошибку
        String s1 = stringList.stream().filter(t -> "3a".equals(t)).findFirst().get();
        System.out.println(s1);

//Вернуть третий элемент коллекции по порядку
        String s2 = stringList.stream().skip(2).findFirst().get();
        System.out.println(s2);

//Вернуть два элемента начиная со второго
        List<String> collect = stringList.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(collect);

        String[] strings = stringList.stream().skip(1).limit(2).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        Object[] objects = stringList.stream().skip(1).limit(2).toArray();
        System.out.println(Arrays.toString(objects));

    }
}
