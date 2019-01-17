package datastructures.queue.impl;

import datastructures.queue.Queue;

public class LinkedListQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int counter;

    @Override
    public void enqueue(T value) {
        Node<T> input = new Node<>(value);

        ++ counter;
        if (isEmpty()) {
            head = input;
            tail = head;
            return;
        }

        input.next = head;
        head.prev = input;
        head = input;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node<T> value = tail;

        tail = value.prev;
        -- counter;

        if (value.prev == null) {
            head = null;
        }

        return value.value;
    }

    @Override
    public T front() {
        if (isEmpty()) {
            return null;
        }
        return tail.value;
    }

    @Override
    public boolean isEmpty() {
        return null == head;
    }

    @Override
    public int size() {
        return counter;
    }

    static class Node<T> {
        private T value;
        private Node<T> prev;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }


    }
}
