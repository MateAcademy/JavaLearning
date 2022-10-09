package com.stream.ex010;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Задача:
 * //У нас есть список сотрудников и мы хотим создать список из их имен, как до 8 джавы и после
 * со стримами решение:
 * <p>
 * и создать список их возрастов:
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>() {{
            add(new Employee("Ann", 20));
            add(new Employee("Kate", 40));
            add(new Employee("Kate", 16));
        }};


        employees.stream().map(Employee::getAge).collect(Collectors.toList());

        List<String> listNames = get(employees, Employee::getName);
        System.out.println(listNames);

        List<Integer> listAges = get(employees, Employee::getAge);
        System.out.println(listAges);

        List<String> listNames2 = get(employees, new Mapper<Employee, String>() {
            @Override
            public String map(Employee employee) {
                return employee.getName();
            }
        });
        System.out.println(listNames2);


        List<Integer> listAges2 = get(employees, new Mapper<Employee, Integer>() {
            @Override
            public Integer map(Employee employee) {
                return employee.getAge();
            }
        });
        System.out.println(listAges2);


        //и проверить хочу что среди наших сотрудников нет ни одного меньше 18 лет

        System.out.println();
        boolean b = employees.stream().noneMatch(y -> y.getAge() < 18);
        System.out.println(b);

//        System.out.println();
//        Optional<Employee> max = employees.stream().max(k -> k.getAge());
//        System.out.println();

    }


    public static <T, U> List<T> get(List<U> list, Mapper<? super U, ? extends T> m) {
        List<T> list1 = new ArrayList<>();
        for (U u : list) {
            list1.add(m.map(u));
        }
        return list1;
    }

    //    public <U, T> List<T> map (List<U> list) {
//        List<T> e = new ArrayList<>();
//        for (U u : list) {
//            e.add(m.map(u));
//        }
//        return e;
//    }

    //У нас есть список сотрудников и мы хотим создать список из их имен:
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



