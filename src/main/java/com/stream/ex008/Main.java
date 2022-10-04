package com.stream.ex008;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * В интерфейсах Predicate, Function, Consumer есть встроенные методы возвращающие лямбда выражение
 */
public class Main {
    public static void main(String[] args) {

        Predicate<Employee> isRich = e -> e.getSalary() > 20000;
        Predicate<Employee> isRich2 = e -> e.getSalary() > 20000;
        Predicate<Employee> isEarly = e -> e.getSalary() <= 10000;

        List<Employee> employees = new ArrayList<>() {{
            add(new Employee(50000));
            add(new Employee(70000));
        }};

       // allMatch Возвращает true, если условие выполняется для всех элементов
        boolean b = employees.stream().allMatch(s -> s.getSalary() > 1);
        System.out.println(b);

//если у нас соответствие всех полей мы передаем ссылку
        boolean x = employees.stream().allMatch(isRich.and(isEarly));
        System.out.println(x);

        System.out.println(employees.stream().allMatch(isRich.and(isRich2)));

    }
}

