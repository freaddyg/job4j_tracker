package ru.job4j.tracker.single;


import ru.job4j.tracker.Tracker;

public enum TrackerSingleFourth {
    TRACKER(new Tracker());


    private Tracker trackerLoad;

    TrackerSingleFourth(Tracker tracker) {
        trackerLoad = tracker;
    }

    public Tracker getInstanse() {
        return trackerLoad;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleFourth.TRACKER.getInstanse().hashCode());
        System.out.println(TrackerSingleFourth.TRACKER.getInstanse().hashCode());
    }
}
