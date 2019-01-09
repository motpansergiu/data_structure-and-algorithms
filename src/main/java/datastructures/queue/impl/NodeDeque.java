package datastructures.queue.impl;

import datastructures.queue.Deque;

public class NodeDeque<T> implements Deque<T> {

    private Node head;

    private Node tail;

    @Override
    public void addFirst(T value) {

        Node temp = new Node(value);

        if (null == head) {
            head = temp;
            tail = head;
            return;
        }

        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    @Override
    public void addLast(T value) {
        Node temp = new Node(value);

        if (null == head) {
            head = temp;
            tail = head;
            return;
        }

        temp.prev = tail;
        tail.next = temp;
        tail = temp;

    }

    @Override
    public T pollFirst() {

        if (null != head) {
            Node temp = head;
            head = temp.next;
            tail.prev = null;

            return (T) temp.value;
        }

        return null;
    }

    @Override
    public T pollLast() {
        if (null != tail) {
            Node temp = tail;
            tail = temp.prev;
            tail.next = null;

            return (T) temp.value;
        }

        return null;
    }

    @Override
    public T peekFirst() {
        if (null != head) {
            return (T) head.value;
        }

        return null;
    }

    @Override
    public T peekLast() {
        if (null != tail) {
            return (T) tail.value;
        }

        return null;
    }

    @Override
    public boolean isEmpty() {
        return null == head;
    }

    static class Node {

        private Object value;

        Node next;

        Node prev;

        Node (Object value) {
            this.value = value;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node temp = head;

        while (null != temp) {
            sb.append(temp.value).append(" ");
            temp = temp.next;
        }

        sb.append("]");

        return sb.toString();

    }
}
