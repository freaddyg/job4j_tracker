package ru.job4j.tracker;

public class GiveAction implements UserAction{
    @Override
    public String name() {
       return "=== Find all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] allItems = tracker.findAll();
        for (int i = 0; i < allItems.length; i++) {
            System.out.println(allItems[i]);
            System.out.println();
        }
        return true;
    }

}
