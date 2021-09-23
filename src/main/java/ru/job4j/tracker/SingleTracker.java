package ru.job4j.tracker;

public final class SingleTracker {
    private static SingleTracker instance = null;
    private Tracker tracker = new Tracker();

    public SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item[] findAll() {
        return findAll();
    }

    public Item[] findByName(String key) {
       return findByName(key);
    }

    private int indexOf(int id) {
      return indexOf(id);
    }

    public Item findById(int id) {
        return findById(id);
    }

    public boolean replace(int id, Item item) {
        return replace(id, item);
    }

    public boolean delete(int id) {
        return delete(id);
    }
}
