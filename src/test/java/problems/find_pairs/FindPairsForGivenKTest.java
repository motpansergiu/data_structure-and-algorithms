package problems.find_pairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPairsForGivenKTest {

    private FindPairsForGivenK finder;

    @BeforeEach
    public void init() {
        finder = new FindPairsForGivenK();
    }

    @Test
    void countPairs() {
        int [] input = {1, 7, 5, 9, 2, 12, 3, 0};
        int k = 2;

        assertEquals(5, finder.countPairs(input, k));
    }
}