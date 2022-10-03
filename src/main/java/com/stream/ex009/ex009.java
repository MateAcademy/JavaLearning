package com.stream.ex009;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Klunniy
 * получить список имен и список возрастов сотрудников, двумя способами, как до джава 8 и со стримами:
 */
public class ex009 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>() {{
            add(new Employee("Kate", 20));
            add(new Employee("Solomiya", 4));
            add(new Employee("Lada", 10));
        }};

        for (Employee e : employees) {
            System.out.print(e.getName() + " ");
        }

        System.out.println();

        for (Employee e : employees) {
            System.out.print(e.getAge() + " ");
        }

        System.out.println();

        employees.stream().map(Employee::getName).forEach(System.out::print);
        System.out.println();
        employees.stream().map(Employee::getAge).forEach(System.out::print);

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
