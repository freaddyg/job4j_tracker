package ru.job4j.tracker.single;

import ru.job4j.tracker.Tracker;

public class TrackerSingleSecond {
    private static final Tracker LOAD = new Tracker();

    private TrackerSingleSecond() {

    }

    public static Tracker loadTracker() {
        return LOAD;
    }

}
