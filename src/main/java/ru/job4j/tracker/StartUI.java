package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select :");
            int select = Integer.valueOf(scanner.nextLine());

            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Entet item name :");
                String name = scanner.nextLine();
                tracker.add(new Item(name));
            } else if (select == 1) {
                Item[] allItems = tracker.findAll();
                for (int i = 0; i < allItems.length; i++) {
                    System.out.println(allItems[i]);
                    System.out.println();
                }
            } else if (select == 2) {
                System.out.println("Введите id заменяемого объекта :");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Введите имя нового объекта :");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                if(tracker.replace(id, newItem)) {
                    System.out.println("Объект успешно заменен!");
                } else {
                    System.out.println("Операция не удалась! Попробуйте заного.");
                }
            } else if (select == 3) {
                System.out.println("Введите id объекта, который хотите удалить :");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Объект успешно удален.");
                } else {
                    System.out.println("Операция не удалась! Попробуйте заного.");
                }
            } else if (select == 4) {
                System.out.println("Введите id для поиска :");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item + "\n");
                } else {
                    System.out.println("Заявка с id = " + id + " не найдена");
                }

            } else if (select == 5) {
                System.out.println("Введите имя искомого объекта :");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
