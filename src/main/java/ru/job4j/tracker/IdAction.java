package ru.job4j.tracker;

public class IdAction implements UserAction {

    private final Output out;

    public IdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите id для поиска :");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с id = " + id + " не найдена");
        }
        return true;
    }

}
