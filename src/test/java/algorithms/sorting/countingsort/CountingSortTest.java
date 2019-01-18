package algorithms.sorting.countingsort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    private CountingSort sort;

    @BeforeEach
    public void init() {
        sort = new CountingSort(10);
    }

    @Test
    void sort() {

        int[] input = {1, 5, 2, 0, 5, 5, 7, 8, 9, 0, 2, 8, 3, 4};
                    // 0, 0, 1, 2, 2, 3, 4, 5, 5, 5, 7, 8, 8, 9
        sort.sort(input);

        for (int i = 0; i < input.length - 1; ++i) {
            assertTrue(input[i] <= input[i+1]);
        }
    }
}