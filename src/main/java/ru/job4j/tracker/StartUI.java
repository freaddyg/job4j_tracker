package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public Item time;

    public StartUI (Item item) {
        time = item;
    }

    public static void main(String[] args) {
        StartUI timeNow = new StartUI(new Item());
        LocalDateTime currentTime = timeNow.time.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(currentTime.format(formatter));
        System.out.println(new Item());
    }
}
