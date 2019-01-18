package algorithms.sorting.radixsort;

import datastructures.queue.Queue;
import datastructures.queue.impl.LinkedListQueue;

public class RadixSortUsing10QueuesMSD {

    private static final int STACK_NUMBER = 10;

    private final Queue<Integer> [] queues;

    public RadixSortUsing10QueuesMSD() {
        queues = new Queue[STACK_NUMBER];

        for (int i = 0; i < STACK_NUMBER; ++i) {
            queues[i] = new LinkedListQueue<>();
        }
    }

    // TODO inefficient - is doing one useless iteration
    public void sort(int [] values) {
        if (null == values) {
            return;
        }
        int power = 1;
        boolean isDiv = true;

        while (isDiv) {
            splitValuesIntoQueues(values, power);
            isDiv = isDividable(queues[0].size(), values.length);
            emptyQueues(values);
            power ++;
        }
    }

    private boolean isDividable(int queueSize, int arrayLength) {
        return queueSize != arrayLength;
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
        return  (int) (value % (Math.pow(10, power)) / Math.pow(10, power - 1));
    }


}
