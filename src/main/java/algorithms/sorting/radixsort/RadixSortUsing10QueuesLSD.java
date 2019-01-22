package algorithms.sorting.radixsort;

import datastructures.queue.Queue;
import datastructures.queue.impl.LinkedListQueue;

public class RadixSortUsing10QueuesLSD {

    private static final int STACK_NUMBER = 10;

    private final Queue<Integer> [] queues;

    public RadixSortUsing10QueuesLSD() {
        queues = new Queue[STACK_NUMBER];

        for (int i = 0; i < STACK_NUMBER; ++i) {
            queues[i] = new LinkedListQueue<>();
        }
    }

    public void sort(int [] values) {
        if (null == values) {
            return;
        }

        int max = getMax(values);
        for (int power = 1; max/power > 0; power *= 10) {
            splitValuesIntoQueues(values, power);
            emptyQueues(values);
        }
    }

    private void splitValuesIntoQueues(int[] values, int power) {
        for (int i = 0; i < values.length; ++i) {
            int value = getDigit(values[i], power);
            queues[value].enqueue(values[i]);
        }
    }

    private void emptyQueues(int[] values) {
        int index = 0;
        for (int i = 0; i < STACK_NUMBER; ++i) {
            while (!queues[i].isEmpty()) {
                values[index++] = queues[i].dequeue();

            }
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
