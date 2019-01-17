package algorithms.sorting.radixsort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortUsing10QueuesMSDTest {

    private RadixSortUsing10QueuesMSD sort;

    @BeforeEach
    public void init() {
        sort = new RadixSortUsing10QueuesMSD();
    }

    @Test
    void sort() {
        int [] input = {47, 10, 51, 32, 2001, 7, 0, 47, 58, 112};
        int [] sorted = {0, 7, 10, 32, 47, 47, 51, 58, 112, 2001};

        sort.sort(input);

        assertArrayEquals(sorted, input);


    }
}