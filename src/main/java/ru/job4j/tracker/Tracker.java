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

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

      public Item[] findByName(String key) {
          int number = 0;
          Item[] rsl = new Item[size];
          for (int index = 0; index < size; index++) {
              Item item = items[index];
              if (item.getName().equals(key)) {
                  rsl[number] = items[index];
                  number++;
              }
          }
          return Arrays.copyOf(rsl, number);
      }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int start = index + 1;
        int length = size - index - 1;
        if (index != -1) {
            System.arraycopy(items, start, items, index, length);
            items[size - 1] = null;
            size--;
        }
        return true;
    }
}


