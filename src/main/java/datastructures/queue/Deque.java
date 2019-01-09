package datastructures.queue;

public interface Deque<T> {

    void addFirst(T value);

    void addLast(T value);

    T pollFirst();

    T pollLast();

    T peekFirst();

    T peekLast();

    boolean isEmpty();
}
