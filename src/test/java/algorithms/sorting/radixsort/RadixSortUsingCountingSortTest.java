package algorithms.sorting.radixsort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortUsingCountingSortTest {

    private RadixSortUsingCountingSort sort;

    @BeforeEach
    public void init() {
        sort = new RadixSortUsingCountingSort();
    }

    @Test
    void sort() {
        int [] input = {47, 10, 51, 32, 2001, 7, 0, 47, 58, 112};
        int [] sorted = {0, 7, 10, 32, 47, 47, 51, 58, 112, 2001};

        sort.sort(input);

        for (int i = 0; i < input.length; ++i)
            System.out.print(input[i] + " ");

        assertArrayEquals(sorted, input);


    }
}