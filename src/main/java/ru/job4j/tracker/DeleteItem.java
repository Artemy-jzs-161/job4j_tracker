package ru.job4j.tracker;

import ru.job4j.tracker.action.UserAction;

public class DeleteItem implements UserAction {
    private final Output out;

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Delete item");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Заявка удалена успешно.");
        } else {
            out.println("Ошибка удаления заявки.");
        }
        return true;
    }
}
