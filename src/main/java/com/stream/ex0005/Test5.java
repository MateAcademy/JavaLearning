package com.stream.ex0005;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author Sergey Klunniy
 * Увеличить зп сотрудникам
 */
public class Test5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(50);
        Employee employee2 = new Employee(60);

        List<Employee> employees = Arrays.asList(employee1, employee2);

//        Consumer<Employee> e = t->t.setSalary(t.getSalary()*2);
//        e.accept(employee1);
//        e.accept(employee2);

        List<Integer> collect = employees.stream().map(t -> {
            t.setSalary(t.getSalary() * 2);
            return t.getSalary();
        }).collect(Collectors.toList());

        System.out.println(employees);
        System.out.println(collect);
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

    @Override
    public String toString() {
        return "salary=" + salary;
    }
}