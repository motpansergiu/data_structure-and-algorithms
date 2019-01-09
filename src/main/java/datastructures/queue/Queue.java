package datastructures.queue;

public interface Queue<T> {

    void enqueue (T value);

    T dequeue();

    T front();

    boolean isEmpty();

}
