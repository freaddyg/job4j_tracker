package ru.job4j.tracker.single;

public class TrackerSingleSecond {
    private static final TrackerSingleSecond INSTANCE = new TrackerSingleSecond();

    private TrackerSingleSecond() {

    }

    public static TrackerSingleSecond getInstance() {
        return INSTANCE;
    }
}
