package ru.job4j.tracker;


import ru.job4j.poly.Transport;

import javax.sound.midi.Track;

public class StartUI {

    public static void createItem(Input input, Tracker tracker){
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Entet item name :");
        tracker.add(new Item(name));
    }

    public static void giveAllItems(Tracker tracker) {
        Item[] allItems = tracker.findAll();
        for (int i = 0; i < allItems.length; i++) {
            System.out.println(allItems[i]);
            System.out.println();
        }
    }

    public static void changeItem(Input input, Tracker tracker) {
        int id = input.askInt("Введите id заменяемого объекта :");
        String name = input.askStr("Введите имя нового объекта :");
        Item newItem = new Item(name);
        if(tracker.replace(id, newItem)) {
            System.out.println("Объект успешно заменен!");
        } else {
            System.out.println("Операция не удалась! Попробуйте заного.");
        }
    }

    public static void searchById(Input input, Tracker tracker) {
        int id = input.askInt("Введите id для поиска :");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item + "\n");
        } else {
            System.out.println("Заявка с id = " + id + " не найдена");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("Введите id объекта, который хотите удалить :");
        if (tracker.delete(id)) {
            System.out.println("Объект успешно удален.");
        } else {
            System.out.println("Операция не удалась! Попробуйте заного.");
        }
    }

    public static  void searchByName(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя искомого объекта :");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
    }



    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select :");

            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.giveAllItems(tracker);
            } else if (select == 2) {
                StartUI.changeItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.searchById(input, tracker);
            } else if (select == 5) {
                StartUI.searchByName(input, tracker);
            } else if (select == 6) {
                run = false;
                System.out.println("Программа завершена");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
