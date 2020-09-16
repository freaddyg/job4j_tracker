package ru.job4j.tracker.single;

import ru.job4j.tracker.Tracker;

public class TrackerSingleFirst {
    private static Tracker instance;

    private TrackerSingleFirst() {

    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
