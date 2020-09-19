package ru.job4j.tracker.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortItemUpTest {

    @Test
    public void compareTestUp() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Егор"));
        items.add(new Item("Антон"));
        items.add(new Item("Владимир"));
        items.add(new Item("Анатолий"));
        items.add(new Item("Иван"));


        List<Item> itemsCopy = new ArrayList<>();

        itemsCopy.add(new Item("Анатолий"));
        itemsCopy.add(new Item("Антон"));
        itemsCopy.add(new Item("Владимир"));
        itemsCopy.add(new Item("Егор"));
        itemsCopy.add(new Item("Иван"));


        Collections.sort(items, new SortItemUp());
        assertThat(items.get(0).getName(), is(itemsCopy.get(0).getName()));

    }
}