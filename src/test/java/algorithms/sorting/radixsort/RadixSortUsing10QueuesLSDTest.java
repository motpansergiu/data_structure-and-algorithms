package algorithms.sorting.radixsort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortUsing10QueuesLSDTest {

    private RadixSortUsing10QueuesLSD sort;

    @BeforeEach
    public void init() {
        sort = new RadixSortUsing10QueuesLSD();
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