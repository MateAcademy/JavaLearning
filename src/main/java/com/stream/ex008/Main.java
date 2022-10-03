package com.stream.ex008;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * В интерфейсах Predicate, Function, Consumer есть встроенные методы возвращающие лямбда выражение
 */
public class Main {
    public static void main(String[] args) {

        Predicate<com.stream.ex010.Employee> isRich = e -> e.getSalary() > 20000;
        Predicate<com.stream.ex010.Employee> isRich2 = e -> e.getSalary() > 20000;
        Predicate<com.stream.ex010.Employee> isEarly = e -> e.getSalary() <= 10000;

        List<com.stream.ex010.Employee> employees = new ArrayList<>() {{
            add(new com.stream.ex010.Employee(50000));
            add(new com.stream.ex010.Employee(70000));
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

class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
