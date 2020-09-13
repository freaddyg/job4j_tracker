package ru.job4j.tracker;


public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

//    public static void createItem(Input input, Tracker tracker){
//        System.out.println("=== Create a new Item ====");
//        String name = input.askStr("Entet item name :");
//        tracker.add(new Item(name));
//    }
//
//    public static void giveAllItems(Tracker tracker) {
//        Item[] allItems = tracker.findAll();
//        for (int i = 0; i < allItems.length; i++) {
//            System.out.println(allItems[i]);
//            System.out.println();
//        }
//    }
//
//    public static void changeItem(Input input, Tracker tracker) {
//        int id = input.askInt("Введите id заменяемого объекта :");
//        String name = input.askStr("Введите имя нового объекта :");
//        Item newItem = new Item(name);
//        if(tracker.replace(id, newItem)) {
//            System.out.println("Объект успешно заменен!");
//        } else {
//            System.out.println("Операция не удалась! Попробуйте заного.");
//        }
//    }
//
//    public static void searchById(Input input, Tracker tracker) {
//        int id = input.askInt("Введите id для поиска :");
//        Item item = tracker.findById(id);
//        if (item != null) {
//            System.out.println(item + "\n");
//        } else {
//            System.out.println("Заявка с id = " + id + " не найдена");
//        }
//    }
//
//    public static void deleteItem(Input input, Tracker tracker) {
//        int id = input.askInt("Введите id объекта, который хотите удалить :");
//        if (tracker.delete(id)) {
//            System.out.println("Объект успешно удален.");
//        } else {
//            System.out.println("Операция не удалась! Попробуйте заного.");
//        }
//    }
//
//    public static  void searchByName(Input input, Tracker tracker) {
//        String name = input.askStr("Введите имя искомого объекта :");
//        Item[] items = tracker.findByName(name);
//        if (items.length > 0) {
//            for (int i = 0; i < items.length; i++) {
//                System.out.println(items[i]);
//            }
//        } else {
//            System.out.println("Заявки с таким именем не найдены");
//        }
//    }



    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select :");
            UserAction act = actions[select];
            run = act.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            out.println(i + ". " + actions[i].name());
        }

        
    }


    public static void main(String[] args) {
        Output consoleOutput = new ConsoleOutput();
        Input input = new ConsoleInput();
        UserAction[] actions = {
                new CreateAction(consoleOutput),
                new GiveAction(consoleOutput),
                new EditAction(consoleOutput),
                new IdAction(consoleOutput),
                new DeleteAction(consoleOutput),
                new NameAction(consoleOutput),
                new ExitAction()
        };
        Tracker tracker = new Tracker();
        new StartUI(consoleOutput).init(input, tracker, actions);
    }
}
