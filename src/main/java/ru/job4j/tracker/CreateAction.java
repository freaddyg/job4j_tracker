package ru.job4j.tracker;

public class CreateAction implements UserAction{

    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter item name :");
        tracker.add(new Item(name));
        return true;
    }
}
