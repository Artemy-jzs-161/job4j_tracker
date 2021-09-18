package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void testFactEx() {
        int rsl = Fact.calc(-1);
    }

    @Test
    public void testFact() {
        int rsl = Fact.calc(10);
        assertThat(rsl, is(3628800));

    }
}