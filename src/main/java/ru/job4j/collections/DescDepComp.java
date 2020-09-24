package ru.job4j.collections;

import java.util.Comparator;

public class DescDepComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String sub1 = o1.substring(0, 2);
        String sub2 = o2.substring(0, 2);
        return sub1.equals(sub2) ? o1.compareTo(o2) : sub2.compareTo(sub1);
    }
}
