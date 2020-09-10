package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }


    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }


    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }


    public Item[] findByName(String key) {
        Item[] itemsList = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                itemsList[count] = items[i];
                count++;
            }
        }
        itemsList = Arrays.copyOf(itemsList, count);
        return itemsList;
    }


    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean res = index != -1 && item != null;
        if (res) {
            int num = items[index].getId();
            item.setId(num);
            items[index] = item;
            return items[index].getName().equals(item.getName()) ? true : false;
        }
        return res;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }


    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}