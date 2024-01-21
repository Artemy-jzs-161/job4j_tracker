package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenMultipleValidInputs() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"2", "5", "3"});
        ValidateInput input = new ValidateInput(out, in);
        int first = input.askInt("Enter first number:");
        int second = input.askInt("Enter second number:");
        int third = input.askInt("Enter third number:");
        assertThat(first).isEqualTo(2);
        assertThat(second).isEqualTo(5);
        assertThat(third).isEqualTo(3);
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-3"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter number:");
        assertThat(selected).isEqualTo(-3);
    }
}