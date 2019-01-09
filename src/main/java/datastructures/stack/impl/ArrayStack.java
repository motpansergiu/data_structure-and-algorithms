package datastructures.stack.impl;

import datastructures.stack.Stack;

public class ArrayStack<T> implements Stack<T> {

    private static final int INITIAL_SIZE = 8;

    private Object [] values;
    private int top;


    public ArrayStack() {
        this(INITIAL_SIZE);
    }

    public ArrayStack(int size) {
        top = -1;
        values = new Object[size];
    }


    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        return (T) values[top--];
    }

    @Override
    public void push(T value) {
        if (top == (values.length - 1)) {
            return;
        }

        values[++top] = value;
    }

    @Override
    public T peek() {

        if (isEmpty()) {
            return null;
        }

        return (T) values[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
