package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSortFullArray() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};

        assertThat(result)
                .containsExactly(expected)
                .isSorted()
                .hasSize(data.length);
    }

    @Test
    public void whenSortThreeElements() {
        int[] data = {11, 10, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 10, 11};

        assertThat(result)
                .containsExactly(expected)
                .isSorted()
                .hasSize(3);
    }

    @Test
    public void whenSortFiveElements() {
        int[] data = {11, 10, 2, 4, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 4, 6, 10, 11};

        assertThat(result)
                .containsExactly(expected)
                .isSorted()
                .hasSize(5);
    }

    @Test
    public void whenAlreadySorted() {
        int[] data = {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);

        assertThat(result)
                .containsExactly(1, 2, 3, 4, 5)
                .isSorted();
    }

    @Test
    public void whenAllSameElements() {
        int[] data = {7, 7, 7, 7, 7};
        int[] result = SortSelected.sort(data);

        assertThat(result)
                .containsExactly(7, 7, 7, 7, 7)
                .isSorted();
    }

    @Test
    public void whenSingleElement() {
        int[] data = {42};
        int[] result = SortSelected.sort(data);

        assertThat(result)
                .containsExactly(42)
                .isSorted()
                .hasSize(1);
    }

    @Test
    public void whenEmptyArray() {
        int[] data = {};
        int[] result = SortSelected.sort(data);

        assertThat(result)
                .isEmpty();
    }
}
