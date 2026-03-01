package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;
    private String name = null;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int i = count; i > 0; i--) {
            name = queue.poll().name();
        }
        return name;
    }

    public String getFirstUpsetCustomer() {
        for (int i = count; i >= 0; i--) {
            name = queue.poll().name();
        }
        return name;
    }
}
