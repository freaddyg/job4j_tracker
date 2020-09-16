package ru.job4j.tracker.single;

import ru.job4j.tracker.Tracker;

public class TrackerSingleThird {

    private TrackerSingleThird() {

    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }
}
