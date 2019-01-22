package algorithms.sorting.radixsort;

public class RadixSortUsingCountingSort {

    public void sort(int [] values) {
        if (null == values) {
            return;
        }

        int max = getMax(values);
        for (int power = 1; max/power > 0; power *= 10) {
            countSort(values, power);
        }
    }

    private void countSort(int [] input, int power) {
        int output[] = new int[input.length]; // output array
        int count[] = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < input.length; i++) {
            count[getDigit(input[i], power)]++;
        }

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = input.length - 1; i >= 0; i--)
        {
            output[count[ (input[i] / power) % 10 ] - 1] = input[i];
            count[ getDigit(input[i], power) ]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (int i = 0; i < output.length; i++) {
            input[i] = output[i];
        }
    }

    private int getDigit(int value, int power) {
        return (value / power) % 10;
    }

    private int getMax(int [] input)
    {
        int max = input[0];
        for (int i = 1; i < input.length; i++)
            if (input[i] > max)
                max = input[i];
        return max;
    }
}
