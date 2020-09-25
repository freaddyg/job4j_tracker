package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComp {
    public static void strCompare(List<String> list) {
        Comparator<String> comparator = (strLeft, strRight) -> {
            System.out.println("Compearing " + strLeft + " " + strRight);
           return Integer.compare(strLeft.length(), strRight.length());
        };
        Collections.sort(list, comparator);
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("AAA");
        lst.add("AAaaaa");
        lst.add("vvvvv");
        strCompare(lst);
    }
}
