package ru.job4j.tracker.single;

public class TrackerSingleThird {

    private TrackerSingleThird() {

    }

    public static TrackerSingleThird getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingleThird INSTANCE = new TrackerSingleThird();
    }
}
