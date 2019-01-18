package datastructures.list;

public class SimpleLinkedList<T> {

    public Node<T> head;

    public void add(T value) {

        Node<T> node = new Node<>(value);
        if (null == this.head) {
            this.head = node;
            return;
        }

        Node<T> headIndex = head;
        while (headIndex.next != null) {
            headIndex = headIndex.next;
        }

        headIndex.next = node;
    }

    public T get(int index) {

        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative value!");
        }

        int counter = 0;
        Node<T> headIndex = head;
        while (headIndex != null) {
            if (counter == index) {
                return headIndex.value;
            }
            headIndex = headIndex.next;
        }

        throw new IllegalArgumentException("Index cannot be bigger than number of elements!");
    }

    public static class Node<T> {
        T value;
        public Node<T> next;

        private Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        Node<T> temp = head;
        while (temp != null) {
            sb.append(temp.value).append(" ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
