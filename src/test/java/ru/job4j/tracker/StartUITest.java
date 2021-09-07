package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenCreateItem() {
        String[] answers = {"Fix PC", "Fix Phone"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        for (int i = 0; i < answers.length; i++) {
            StartUI.createItem(input, tracker);
        }
        Item created = tracker.findAll()[1];
        Item expected = new Item("Fix Phone");
        assertThat(created.getName(), is(expected.getName()));

    }

    @Test
    public void deteleItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Вася");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId())};
        StartUI.deteleItem(new StubInput(answers), tracker);
        Item delete = tracker.findById(item.getId());
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void editItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("Вася");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), "Петя"};
        StartUI.editItems(new StubInput(answers), tracker);
        Item edit = tracker.findById(item.getId());
        assertThat(edit.getName(), is("Петя"));
    }
}
