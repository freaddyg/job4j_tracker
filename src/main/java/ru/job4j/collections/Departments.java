package ru.job4j.collections;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
               start += el + "/";
               tmp.add(start.substring(0, start.length() - 1));
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DescDepComp());
    }

    public static void main(String[] args) {
        List<String> dep = new ArrayList<>();
        dep.add("K1/SK1");
        dep.add("K1/SK2");
        dep.add("K2/SK1");
        dep.add("K2/SK2");

        List<String> list = fillGaps(dep);
        sortDesc(list);
        for (String l : list) {
            System.out.println(l);
        }

    }
}
