package com.stream.ex0004;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sergey Klunniy
 */
public class Test {

    static List<Integer> collection2 = new ArrayList<>() {

//я пытаюсь вызвать внутри стат класса не статический метод
//на момент инициализации статического класса еще не будет ссылки add
//компилятор еще не будет знать что такое add

        //можем протестировать что быстрее лямбда или анонимный класс
       // static {
{
            add(4);
            add(-2);
            add(-2);
        }};


    public static void main(String[] args) {

        //не смогу добавить ничего, почему?  нерасширяемую коллекцию
        //так как unmodifiable list
        //с точки зрения сохранения памяти это потому что люди не знают об анонимн классах

        // почему это экономичней
        //это не статический блок инициализации
        //ListN это что такое - это констр?
        List<Integer> collection2 = new ArrayList<>() {{
            add(5);
            add(10);
        }};


        List<Integer> collection = new ArrayList<>(List.of(4, -2, -2));

        //        List<Integer> collection = List.of(4, -2, -2);
        collection.add(5);


        //collection.stream().filter(x->x>=0).forEach(System.out::println);

        //collection.stream().skip(5).forEach(System.out::println);

        //List<Integer> collect = collection.stream().distinct().collect(Collectors.toList());

        List<String> collect = collection.stream().map(String::valueOf).collect(Collectors.toList());

        //что такое коллект?
    }
}
