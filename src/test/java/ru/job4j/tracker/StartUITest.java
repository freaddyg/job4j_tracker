package ru.job4j.tracker;

import org.junit.Test;

import java.io.OutputStream;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

//public class StartUITest{
//
//    @Test
//    public void whenCreateItem() {
//        Output stubOutput = new StubOutput();
//        Input in = new StubInput(
//                new String[] {"0", "Item name", "1"}
//        );
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new CreateAction(stubOutput),
//                new ExitAction()
//        };
//        new StartUI(stubOutput).init(in, tracker, actions);
//        assertThat(tracker.findAll()[0].getName(), is("Item name"));
//    }
//
//    @Test
//    public void whenReplaceItem() {
//        Output stubOutput = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Replaced item"));
//        int id = item.getId();
//        String replacedName = "New item name";
//        Input in = new StubInput(
//                new String[] {"0" , id + "", replacedName, "1"}
//        );
//        UserAction[] actions = {
//                new EditAction(stubOutput),
//                new ExitAction()
//        };
//        new StartUI(stubOutput).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Output stubOutput = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Deleted item"));
//        int id = item.getId();
//        Input in = new StubInput(
//                new String[] {"0", id + "", "1"}
//        );
//        UserAction[] actions = {
//                new DeleteAction(stubOutput),
//                new ExitAction()
//        };
//        new StartUI(stubOutput).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
//    }
//
//    @Test
//    public void whenExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[]{"0"}
//        );
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new ExitAction()
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                "Menu." + System.lineSeparator() +
//                        "0. === Exit ===" + System.lineSeparator()
//        ));
//    }
//
//    @Test
//    public  void whenFindAll() {
//        Output stubOutput = new StubOutput();
//        Tracker tracker = new Tracker();
//        tracker.add(new Item("first item"));
//        tracker.add(new Item("second item"));
//        Input in = new StubInput(
//                new String[] {"0", "1"}
//        );
//        UserAction[] actions = {
//                new GiveAction(stubOutput),
//                new ExitAction()
//        };
//        String[] names = {"first item", "second item"};
//        new StartUI(stubOutput).init(in, tracker, actions);
//        assertThat(stubOutput.toString(), is("Menu." + System.lineSeparator() +
//                "0. === Find all Items ===" + System.lineSeparator() +
//                "1. === Exit ===" + System.lineSeparator() +
//                "Item{id=1, name='first item'}" + System.lineSeparator() +
//                "Item{id=2, name='second item'}" + System.lineSeparator() +
//                "Menu." + System.lineSeparator() +
//                "0. === Find all Items ===" + System.lineSeparator() +
//                "1. === Exit ===" + System.lineSeparator()));
//
//    }
//
//    @Test
//    public void whenFindByName() {
//        Output stubOutput = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Search item"));
//        String name = item.getName();
//        Input in = new StubInput(
//                new String[] {"0", name, "1"}
//        );
//        UserAction[] actions = {
//                new NameAction(stubOutput),
//                new ExitAction()
//        };
//        new StartUI(stubOutput).init(in, tracker, actions);
//        assertThat(stubOutput.toString(), is("Menu." + System.lineSeparator() +
//                "0. === Find items by name ===" + System.lineSeparator() +
//                "1. === Exit ===" + System.lineSeparator() +
//                "Item{id=1, name='Search item'}" + System.lineSeparator() + "Menu." + System.lineSeparator() +
//                "0. === Find items by name ===" + System.lineSeparator() +
//                "1. === Exit ===" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenFindById() {
//        Output stubOutput = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Search item"));
//        int id = item.getId();
//        Input in = new StubInput(
//                new String[] {"0", id + "", "1"}
//        );
//        UserAction[] actions = {
//                new IdAction(stubOutput),
//                new ExitAction()
//        };
//        new StartUI(stubOutput).init(in, tracker, actions);
//        System.out.println(stubOutput.toString());
//        assertThat(stubOutput.toString(), is("Menu." + System.lineSeparator() +
//                "0. === Find item by id ===" + System.lineSeparator() +
//                "1. === Exit ===" + System.lineSeparator() +
//                "Item{id=1, name='Search item'}" + System.lineSeparator() +
//                "Menu." + System.lineSeparator() +
//                "0. === Find item by id ===" + System.lineSeparator() +
//                "1. === Exit ===" + System.lineSeparator()));
//    }
//
//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(
//                new String[] { "7",  "0"}
//        );
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new ExitAction()
//        };
//        new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(
//                String.format(
//                        "Menu.%n"
//                                + "0. === Exit ===%n"
//                                + "Wrong input, you can select: 0 .. 0%n"
//                                + "Menu.%n"
//                                + "0. === Exit ===%n"
//                )
//        ));
//    }
//}