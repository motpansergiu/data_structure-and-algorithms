package datastructures.stack.impl;

import datastructures.stack.Stack;

public class NodeStack<T> implements Stack<T> {

    private Node head;

    @Override
    public T pop() {
        if (null == head) {
            return null;
        }

        Node temp = head;
        head = head.next;

        return (T) temp.value;
    }

    @Override
    public void push(T value) {
        Node temp = new Node(value);

        if (null == head) {
            head = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    @Override
    public T peek() {

        if (null == head) {
            return null;
        }

        return (T) head.value;
    }

    @Override
    public boolean isEmpty() {
        return null == head;
    }

    static class Node {
        private Object value;
        private Node next;

        Node(Object value) {
            this.value = value;
        }
    }
}
