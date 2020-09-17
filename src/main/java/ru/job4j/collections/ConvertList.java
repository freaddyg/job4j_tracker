package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] elem : list) {
            for (int el : elem) {
                rsl.add(el);
            }
        }
        return rsl;
    }
}
