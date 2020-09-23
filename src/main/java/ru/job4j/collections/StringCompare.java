package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<Character> ch1 = new ArrayList<>();
        List<Character> ch2 = new ArrayList<>();
        int count = 0;
        int rsl = 0;

        for (int i = 0; i < o1.length(); i++) {
            ch1.add(o1.charAt(i));
        }

        for (int i = 0; i < o2.length(); i++) {
            ch2.add(o2.charAt(i));
        }

        while (count < ch1.size() && count < ch2.size()) {
            rsl = Character.compare(ch1.get(count), ch2.get(count));
            if (rsl < 0 || rsl > 0) {
                return rsl;
            }
            count++;
        }
        if (ch2.size() > ch1.size()) {
            rsl = -1;
        } else if (ch2.size() < ch1.size()) {
            rsl = 1;
        }
        return rsl;
    }
}
