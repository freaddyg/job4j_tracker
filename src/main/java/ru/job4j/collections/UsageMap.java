package ru.job4j.collections;

import java.util.HashMap;

public class UsageMap {
    private static HashMap<String, String> data = new HashMap<>();

    public static void main(String[] args) {
        data.put("yuriykorsakov1984@gmail.com", "Korsakov Yuriu");
        for (String key : data.keySet()) {
            System.out.println(key + " " + data.get(key));
        }
    }
 }
