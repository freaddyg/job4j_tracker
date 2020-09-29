package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMatrix {

    public List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(el -> Stream.of(el))
                .collect(Collectors.toList());
    }
}
