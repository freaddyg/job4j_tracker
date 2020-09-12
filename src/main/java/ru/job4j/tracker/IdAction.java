package ru.job4j.tracker;

public class IdAction implements UserAction{

    @Override
    public String name() {
        return "=== Find item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите id для поиска :");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item + "\n");
        } else {
            System.out.println("Заявка с id = " + id + " не найдена");
        }
        return true;
    }

}
