package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMatrix {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][] {{1, 2}, {3, 4}};

        List<Integer> listMatrix = Stream.of(matrix)
                                            .flatMap(el -> Stream.of(el))
                                            .collect(Collectors.toList());

        System.out.println(listMatrix.toString());
    }
}
