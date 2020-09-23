package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        List<Character> ch1 = new ArrayList<>();
        List<Character> ch2 = new ArrayList<>();
        int rsl;

        for (int i = 0; i < o1.length(); i++) {
            ch1.add(o1.charAt(i));
        }

        for (int i = 0; i < o2.length(); i++) {
            ch2.add(o2.charAt(i));
        }
        int length = o1.length() < o2.length() ? o1.length() : o2.length();
        for (int i = 0; i < length; i++) {
            rsl = Character.compare(ch1.get(i), ch2.get(i));
            if (rsl < 0 || rsl > 0) {
                return rsl;
            }
        }
        rsl = o1.length() - o2.length();
        return rsl;
    }

}
