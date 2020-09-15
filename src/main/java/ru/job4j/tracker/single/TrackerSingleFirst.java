package ru.job4j.tracker.single;

public class TrackerSingleFirst {
    private static TrackerSingleFirst instance;

    private TrackerSingleFirst() {

    }

    public static TrackerSingleFirst getInstance() {
        if (instance == null) {
            instance = new TrackerSingleFirst();
        }
        return instance;
    }

}
