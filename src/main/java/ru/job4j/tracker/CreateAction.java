package ru.job4j.tracker;

public class CreateAction implements UserAction{

    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Entet item name :");
        tracker.add(new Item(name));
        return true;
    }
}
