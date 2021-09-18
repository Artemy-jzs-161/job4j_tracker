package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

   // @Test
   // public void whenCreateItem() {
   //     Input in = new StubInput(
   //             new String[]{"0", "Item name", "1"}
   //     );
   //     Tracker tracker = new Tracker();
   //     UserAction[] actions = {
   //             new CreateAction(out),
   //             new Exit()
   //     };
   //     new StartUI().init(in, tracker, actions);
   //     assertThat(tracker.findAll()[0].getName(), is("Item name"));
   // }
//
   // @Test
   // public void whenEditItem() {
   //     Tracker tracker = new Tracker();
   //     Item item = tracker.add(new Item("Replaced item"));
   //     String replacedName = "New item name";
   //     Input in = new StubInput(
   //             new String[]{"0", String.valueOf(item.getId()), replacedName, "1"});
   //     UserAction[] actions = {
   //             new EditItems(),
   //             new Exit()};
   //     new StartUI().init(in, tracker, actions);
   //     assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
   // }
//
   // @Test
   // public void whenDeleteItem() {
   //     Tracker tracker = new Tracker();
   //     Item item = tracker.add(new Item("Deleted item"));
   //     Input in = new StubInput(
   //             new String[]{"0", String.valueOf(item.getId()), "1"});
   //     UserAction[] actions = {
   //             new DeleteItem(),
   //             new Exit()};
   //     new StartUI().init(in, tracker, actions);
   //     assertThat(tracker.findById(item.getId()), is(nullValue()));
   // }

    //@Test
    //public void whenAddItem() {
    //    String[] answers = {"Fix PC"};
    //    Input input = new StubInput(answers);
    //    Tracker tracker = new Tracker();
    //    StartUI.createItem(input, tracker);
    //    Item created = tracker.findAll()[0];
    //    Item expected = new Item("Fix PC");
    //    assertThat(created.getName(), is(expected.getName()));
    //}

    //@Test
    //public void whenCreateItem() {
    //    String[] answers = {"Fix PC", "Fix Phone"};
    //    Input input = new StubInput(answers);
    //    Tracker tracker = new Tracker();
    //    for (int i = 0; i < answers.length; i++) {
    //        StartUI.createItem(input, tracker);
    //    }
    //    Item created = tracker.findAll()[1];
    //    Item expected = new Item("Fix Phone");
    //    assertThat(created.getName(), is(expected.getName()));

    //}

    //@Test
    //public void deteleItem() {
    //    Tracker tracker = new Tracker();
    //    Item item = new Item("Вася");
    //    tracker.add(item);
    //    String[] answers = {
    //            String.valueOf(item.getId())};
    //    StartUI.deteleItem(new StubInput(answers), tracker);
    //    Item delete = tracker.findById(item.getId());
    //    assertNull(tracker.findById(item.getId()));
    //}

    //@Test
    //public void editItems() {
    //    Tracker tracker = new Tracker();
    //    Item item = new Item("Вася");
    //    tracker.add(item);
    //    String[] answers = {
    //            String.valueOf(item.getId()), "Петя"};
    //    StartUI.editItems(new StubInput(answers), tracker);
    //    Item edit = tracker.findById(item.getId());
    //    assertThat(edit.getName(), is("Петя"));
    //}
}
