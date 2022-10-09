package com.stream.ex007;

import com.learning.lessons.lesson00.ex_002_stream.stream.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sergey Klunniy
 * добраться до студентов и отсортировать по среднему балу
 */
public class Main {
    public static void main(String[] args) {
        int[] marksSt1 = new int[] {5, 5};
        Student st1 = new Student(marksSt1);

        int[] marksSt2 = new int[] {2, 2, 2};
        Student st2 = new Student(marksSt2);

        int[] marksSt3 = new int[] {3, 3};
        Student st3 = new Student(marksSt3);

        Student[] students = new Student[] {st1, st2, st3};
        Group group1 = new Group(students);

        List<Group> groupList = new ArrayList<>() {{
            add(group1);
        }};

        System.out.println(groupList);

//я могу добраться до студентов и отсортировать их по среднему балу

//в стримах очень важно знать это что ты получаешь от каждого следующего оператора
// массив из студентов ты будешь получать по одному в каждой следующей итерации   а стрим из студентов будет тебе передавать по одному
//        студенту в каждый следующий итератор


//я вернул лист средних значений отсортированных по возрастающей
//начиная с флетмэп что я у каждого опратора беру на вход и что получаю на выход?

//        List groupList2 = groupList.stream().map(t-> t.getStudents()) //
//                .map(o-> Arrays.stream(o.getMarks()).average().getAsDouble())
//                .sorted((o1, o2) -> (int) (o1 - o2))
//                .collect(Collectors.toList());


//        List groupList2 = groupList.stream().flatMap(t-> Arrays.stream(t.getStudents()))
//                .map(o-> Arrays.stream(o.getMarks()).average().getAsDouble())
//                .sorted((o1, o2) -> (int) (o1 - o2))
//                .collect(Collectors.toList());

//                List groupList2 = groupList.stream().flatMap(t-> Arrays.stream(t.getStudents()))
//                .map(o-> Arrays.stream(o.getMarks()).average().getAsDouble())
//                .sorted((o1, o2) -> (int) (o1 - o2))
//                .collect(Collectors.toList());

//а могу ли я вернуть массив студентов? какую композицию ты хочешь получить?
//какой из операторов мне опдойдет, что бы принимал студентов, сортировал и отдавал их

//        List groupList2 = groupList.stream().flatMap(t->Arrays.stream(t.getStudents()))
//                        .sorted(Comparator.comparingDouble(Student::getAverage)).collect(Collectors.toList());

//        List<Student> groupList2 = groupList.stream().flatMap(t->Arrays.stream(t.getStudents()))
//                        .sorted(Comparator.comparingDouble(student ->
//                                Arrays.stream(student.getMarks()).boxed().mapToInt(Integer::intValue).average().getAsDouble()
//                        )).collect(Collectors.toList());

      // Arrays.stream(marks).mapToObj(Integer::valueOf).mapToInt(Integer::intValue).average().getAsDouble()
//        System.out.println(groupList2);


        //collection.stream().mapToInt((s) -> Integer.parseInt(s)).average()

        //collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new)

    }
}

class Group {
    private Student[] students;

    @Override
    public String toString() {
        return Arrays.toString(students);
    }

    public Group(Student... students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

class Student {
    private int[] marks;

    public Student(int... marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return Arrays.toString(marks);
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getAverage() {
        return Arrays.stream(marks).mapToObj(Integer::valueOf).mapToInt(Integer::intValue).average().getAsDouble();
    }
}
