package ru.job4j.tracker.single;

import ru.job4j.tracker.Tracker;

public class TrackerSingle {
    private static final Tracker LOAD = new Tracker();

    private TrackerSingle() {

    }

    public static Tracker loadTracker() {
        return LOAD;
    }

}
