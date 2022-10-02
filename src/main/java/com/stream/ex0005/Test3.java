package com.stream.ex0005;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Способы создания стримов: Arrays.asList, из значений, из коллекций и из массива.
 * Задача, отсортировать эти значения, убрать дубликаты и вывести на экране содержимое?
 */
public class Test3 {
    public static void main(String[] args) {

        List<Integer> collect = Arrays.asList(10, -20, 30, 40, 50)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        //выделяю и нажимаю ctrl + alt + v и оборачиваю в обычный лист

        collect.forEach(System.out::println);

        //stream из значений
        Stream<Integer> integerStream = Stream.of(10, 20, 30);

        String[] arr = {"Yevhenii", "Karyna", "Marsel"};
        //stream из массива
        Stream<String> stream = Arrays.stream(arr);

        Stream<Object> build = Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .build();

        IntStream chars = "Hello".chars();

        /**
         * konveernue
         * map, filter, disctinct(удаляет дубликаты), parallel(мы можем создавать еще паралельные потоки
         * к примеру мы можем с обычного состояния перейти в паралельный сделать какуюто операцию паралельно и вернуться к обычному состоянию),
         * flatMap(это когда есть возможность создать из одного элемента несколько элементов)
         * skip - пропустить несколько значений, например у нас генератор случайных значений, limit
         *
         *siquential -последовательные потоки
         *
         * flatMap это когда мы из дного
         *
         *
         * terminalnue:
         *      forEach - для перебора элементов
         *      collect - собирает элементы в виде коллекции
         *      toArray
         *      toList
         *      min/max/summ/count, matcher(anyMatch, allMatch)
         *      findFirst, findAny
         *      iterator - генерирует бесконечний поток
         */


    }

}