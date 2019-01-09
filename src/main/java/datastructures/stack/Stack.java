package datastructures.stack;

public interface Stack<T> {

    T pop();

    void push(T value);

    T peek();

    boolean isEmpty();

}
