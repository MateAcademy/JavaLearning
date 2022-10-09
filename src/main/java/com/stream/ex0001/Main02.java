package com.stream.ex0001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sergey Klunniy
 * А можно ли ArrayList отсортировать без стрима?
 * sort как работает? мы итерируемся по всему массиву и в метод comparingInt на каждой итерации передаем обьект и именно у обьекта вызываем
 * метод length
 * мы можем вызвать метод у класса того типа обьект которого сюда передастся
 * мы можем вызвать только из класса стринг или из обьджект
 * мы вызываем методы у класса стринг или у обьекта, у кого?
 */
public class Main02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("GoodBye");
        list.add("Hello");
        list.add("Ab");
        list.add("a");

        list.sort(Comparator.comparingInt(String::length));

        System.out.println(list);
    }
}
