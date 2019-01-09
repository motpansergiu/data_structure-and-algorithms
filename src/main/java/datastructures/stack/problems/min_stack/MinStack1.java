package datastructures.stack.problems.min_stack;


/**         ** TASK **
 * Adăugaţi structurii de stivă o nouă funcţie numită min,
 * funcţie care returnează cel mai mic element.
 * Push, pop şi min trebuie să aibă complexitate O(1)
 */


public class MinStack1 {

    private Node head;

    void push (int value) {

        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            head.min = value;
            return;
        }

        temp.next = head;
        temp.min = head.min;
        head = temp;

        if (head.min > value) {
            head.min = value;
        }
    }

    int pop() {

        Node temp = head;
        head = head.next;

        return temp.min;
    }

    int min() {
        return head.min;
    }

    static class Node {

        int value;
        int min;
        Node next;


        Node(int value) {
            this.value = value;
        }

    }
}
