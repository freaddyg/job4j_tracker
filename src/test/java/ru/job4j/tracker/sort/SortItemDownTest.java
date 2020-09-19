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
        List<Item> items = new ArrayList<>();
        items.add(new Item("Егор"));
        items.add(new Item("Антон"));
        items.add(new Item("Владимир"));
        items.add(new Item("Анатолий"));
        items.add(new Item("Иван"));


        List<Item> itemsCopy = new ArrayList<>();

        itemsCopy.add(new Item("Иван"));
        itemsCopy.add(new Item("Егор"));
        itemsCopy.add(new Item("Владимир"));
        itemsCopy.add(new Item("Антон"));
        itemsCopy.add(new Item("Анатолий"));


        Collections.sort(items, new SortItemDown());
        assertThat(items.get(4).getName(), is(itemsCopy.get(4).getName()));
    }
}