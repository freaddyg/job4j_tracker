package ru.job4j.tracker;

public class NameAction implements UserAction{

    private final Output out;

    public NameAction(Output out) {
        this.out = out;
    }


    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя искомого объекта :");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                out.println(items[i]);
            }
        } else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }

}
