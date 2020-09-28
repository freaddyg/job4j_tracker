package ru.job4j.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> result = students.stream()
                                .filter(predict)
                                .collect(Collectors.toList());
        return result;
    }

    public Map<String, Student> collectToMap(List<Student> students) {
        Map<String, Student> result = students.stream()
                                    .collect(Collectors.toMap(std -> std.getSurName(),
                                            std -> std,
                                            (str1, str2) -> str1.equals(str2) ? str1 : str2));

        return result;
    }
}
