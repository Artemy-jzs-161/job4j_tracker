package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
            return true;
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
            return false;
        }
    }
}