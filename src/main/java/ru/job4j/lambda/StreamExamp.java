package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamp {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-3);
        nums.add(2);
        nums.add(5);
        nums.add(11);

        List<Integer> res = nums.stream().filter(
                num -> num > 0
        ).collect(Collectors.toList());

    }
}
