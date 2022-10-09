package com.stream.questions_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
public class T {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>() {{
            add(new People("Sergey", 15));
            add(new People("Alex", 19));
            add(new People("Maria", 30));
            add(new People("Alla", 30));
            add(new People("Nika", 10));
        }};

        //вывеси средний возраст людей больше 18ти?
        double asDouble = peopleList.stream().mapToInt(t -> t.getAge()).filter(age -> age > 20).average().getAsDouble();
        System.out.println(asDouble);

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
