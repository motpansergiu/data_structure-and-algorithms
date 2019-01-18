package datastructures.list.problems.reverse_simple_linked_list;

import datastructures.list.SimpleLinkedList;

public class ReverseLinkedList {

    public void reverse(SimpleLinkedList<Integer> list) {

        SimpleLinkedList.Node<Integer> tail = getTail(list.head);
        SimpleLinkedList.Node<Integer> temp;

        while (list.head != tail) {
            temp = list.head;
            list.head = temp.next;
            temp.next = null;
            temp.next = tail.next;
            tail.next = temp;
        }
    }

    private SimpleLinkedList.Node<Integer> getTail(SimpleLinkedList.Node<Integer> head) {
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}
