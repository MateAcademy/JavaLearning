package com.stream.ex0005;

import java.util.ArrayList;
import java.util.List;

/**
 *  Задача, сколько у нас людей с возрастом больше 18ти?
 *  Задача 2: вывеси средний возраст людей больше 18ти?
 *  Что такое поджо обьект?
 */
public class Test2 {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>() {{
            add(new People("Sergey", 15));
            add(new People("Alex", 19));
            add(new People("Maria", 22));
            add(new People("Alla", 30));
            add(new People("Nika", 10));
        }};


        System.out.println(peopleList.stream().map(t -> t.getAge()).filter(y -> y > 18).count());

        double d = peopleList.stream().filter(p->p.getAge()>=18).mapToInt(People::getAge)
                .average().getAsDouble();

        System.out.println(d);
    }
}

class People {
    private String name;
    private Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
