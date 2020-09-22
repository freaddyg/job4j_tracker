package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete item by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Введите id объекта, который хотите удалить :");
        if (tracker.delete(id)) {
            out.println("Объект успешно удален.");
        } else {
            out.println("Операция не удалась! Попробуйте заного.");
        }
        return true;
    }
}
