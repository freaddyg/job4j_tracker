package ru.job4j.tracker;

import java.util.List;

public class GiveAction implements UserAction {

    private final Output out;

    public GiveAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
       return "=== Find all Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> allItems = tracker.findAll();
        for (Item item : allItems) {
            out.println(item);
        }
        return true;
    }

}
