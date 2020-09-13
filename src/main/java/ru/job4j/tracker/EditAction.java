package ru.job4j.tracker;

public class EditAction implements UserAction{

    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }


    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите id заменяемого объекта :");
        String name = input.askStr("Введите имя нового объекта :");
        Item newItem = new Item(name);
        if(tracker.replace(id, newItem)) {
            out.println("Объект успешно заменен!");
        } else {
            out.println("Операция не удалась! Попробуйте заного.");
        }
        return true;
    }
}
