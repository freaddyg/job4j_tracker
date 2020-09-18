package ru.job4j.tracker.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortItemDownTest {

    @Test
    public void compareDown() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Егор"));
        tracker.add(new Item("Антон"));
        tracker.add(new Item("Владимир"));
        tracker.add(new Item("Анатолий"));
        tracker.add(new Item("Иван"));

        List<Item> items = tracker.findAll();
        List<Item> itemsCopy = new ArrayList<>();
        itemsCopy.addAll(items);
        Collections.sort(itemsCopy, new SortItemDown());
        Collections.sort(items, new SortItemDown());
        assertThat(items, is(itemsCopy));
    }
}