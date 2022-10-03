package com.stream.ex010;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class ex0010 {
    public static void main(String[] args) {

    }

    public List<String> empNames(List<Employee> employees) {
        List<String> e = new ArrayList<>();
        for (Employee emp : employees) {
            e.add(emp.getName());
        }
        return e;
    }

    public List<Integer> empAges(List<Employee> employees) {
        List<Integer> e = new ArrayList<>();
        for (Employee emp : employees) {
            e.add(emp.getAge());
        }
        return e;
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}