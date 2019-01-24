package problems.find_pairs;

import java.util.Arrays;

/**
 * Given an array of distinct integers values, count the number of pairs of integers that have the
 * difference k.
 */

public class FindPairsForGivenK {

    public int countPairs(int [] input, int value) {
        int max = max(input);
        int [] hash = new int[max + 1];
        int counter = 0;

        Arrays.fill(hash, 0);
        initHash(input, hash);

        for (int i = 0; i < input.length; ++i) {
            counter += countLower(input[i], hash, value);
            counter += countUpper(input[i], hash, value);
            // mark hash visited
            ++ hash[input[i]];
        }

        return counter;
    }

    private void initHash(int[] input, int[] hash) {
        for (int i = 0; i < input.length; ++i) {
            hash[input[i]] = 1;
        }
    }

    private int countLower(int input, int[] hash, int value) {
        int lower = input - value;
        int counter = 0;
        if ((lower >= 0) && (hash[lower] == 1)) {
            print(input, lower);
            ++ counter;
        }

        return counter;
    }

    private int countUpper(int input, int[] hash, int value) {
        int upper = input + value;
        int counter = 0;
        if ((upper < hash.length) && (hash[upper] == 1)) {
            print(input, upper);
            ++ counter;
        }

        return counter;
    }

    private void print(int value1, int value2) {
        // DEBUG
        System.out.println("(" + value1 + ":" + value2 + ")");
    }

    private int max(int [] input) {
        int max = input[0];
        for (int i = 1; i < input.length; ++i) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

}
