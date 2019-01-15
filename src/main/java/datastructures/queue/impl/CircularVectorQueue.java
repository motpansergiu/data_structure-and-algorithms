package datastructures.queue.impl;

import datastructures.queue.Queue;


public class CircularVectorQueue<T> implements Queue<T> {

    private int head;
    private int tail;
    private int size;
    private Object [] elements;
    private int numberOfElements;

    public CircularVectorQueue(int size) {
        this.elements = new Object[size];
        this.size = size;
        this.head = -1;
        this.tail = -1;
        this.numberOfElements = 0;
    }

    @Override
    public void enqueue(T value) {

        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }

         ++ numberOfElements;

        if (isEmpty()) {
            head = 0;
            tail = 0;
            elements[tail] = value;
            return;
        }

        if (tail == (size - 1)) {
            tail = 0;
            elements[tail] = value;
            return;
        }

        elements[++tail] = value;
    }

    private boolean isFull() {
        return (head == 0 && tail == (size - 1)) || (tail == (head - 1));
    }

    @Override
    public T dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is full");
        }

        -- numberOfElements;

        if (head == tail) {
            T value = (T) elements[head];
            head = -1;
            tail = -1;
            return value;
        }


        if (head == (size - 1)) {
            T value = (T) elements[head];
            head = 0;
            return value;
        }

        T value = (T) elements[head];
        ++ head;

        return value;
    }

    @Override
    public T front() {

        if (isEmpty()) {
            return null;
        }

        return (T) elements[head];
    }

    @Override
    public boolean isEmpty() {
        return (head == -1);
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{\n");
        sb.append("head = ").append(head).append("\n");
        sb.append("tail = ").append(tail).append("\n");
        sb.append("[ ");

        for (int i = 0; i < elements.length; ++i) {
            sb.append(elements[i]).append(" ");
        }
        sb.append("]\n}");

        return sb.toString();
    }
}
