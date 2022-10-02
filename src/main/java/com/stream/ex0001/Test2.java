package com.stream.ex0001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("GoodBye");
        list.add("Hello");
        list.add("Ab");
        list.add("a");

        list.sort(Comparator.comparingInt(String::length));
//sort как работает? мы итерируемся по всему массиву и в метод comparingInt на каждой итерации передаем обьект и именно у обьекта вызываем
//        метод length
// мы можем вызвать метод у класса того типа обьект которого сюда передастся
// мы можем вызвать только из класса стринг или оз обьджект
// мы вызываем методы у класса стринг или у обьекта?

        System.out.println(list);

    }
}
