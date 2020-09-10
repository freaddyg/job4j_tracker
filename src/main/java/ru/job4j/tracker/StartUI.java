package ru.job4j.tracker;


public class StartUI {


    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.setName("first");
        item2.setName("Second");
        item3.setName("thrid");

        tracker.add(item1);
        tracker.add(item3);
        tracker.add(item2);


       Item second = tracker.findById(2);

       System.out.println(second.getId());

    }
}
