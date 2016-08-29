package com.olemba;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Tomasz on 29.08.2016.
 */
public class Application {
    public static void main(String[] args) {
        List<Student> students = createList();
        List<Student> studentsIdOver50 = students.stream()
                .filter(s -> s.getId() > 50)
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(studentsIdOver50);

        students.stream()
                .filter(s -> s.getId() > 50)
                .sorted(Comparator.comparing(Student::getId))
                .forEach(System.out::println);
    }

    public static List<Student> createList(){
        return Arrays.asList(
                new Student("Tom", 123),
                new Student("Jack", 1),
                new Student("Jenny", 43),
                new Student("David", 68),
                new Student("Kate", 167),
                new Student("John", 1923),
                new Student("Roger", 19),
                new Student("Tom", 12),
                new Student("Kate", 7)
        );
    }
}

