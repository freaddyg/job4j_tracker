package ru.job4j.collections;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int length = o1.length() < o2.length() ? o1.length() : o2.length();
        for (int i = 0; i < length; i++) {
            char ch1 = o1.charAt(i);
            char ch2 = o2.charAt(i);
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }
        return o1.length() - o2.length();
    }

}
