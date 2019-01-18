package algorithms.sorting.countingsort;

public class CountingSort {

    private int upperBound;

    public CountingSort(int upperBound) {
        this.upperBound = upperBound;
    }

    public void sort(int [] input) {

        // The output array that will have sorted arr
        int [] output = new int[input.length];

        // Create a count array to store count of inidividul
        int [] count = new int[upperBound];

        for (int i = 0; i < input.length; ++ i) {
            ++ count[input[i]];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i < upperBound; ++ i) {
            count[i] += count[i-1];
        }

        // Build the output array
        // To make it stable we are operating in reverse order.
        for (int i = input.length - 1; i >= 0; --i) {
            output[count[input[i]] - 1] = input[i];
            --count[input[i]];
        }

        // Copy the output output to input
        // contains sorted values
        for (int i = 0; i < input.length; ++i) {
            input[i] = output[i];
        }
    }
}
