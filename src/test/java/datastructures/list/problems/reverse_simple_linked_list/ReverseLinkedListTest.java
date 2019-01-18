package datastructures.list.problems.reverse_simple_linked_list;

import datastructures.list.SimpleLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    public void init() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void reverse() {

        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();

        simpleLinkedList.add(10);
        simpleLinkedList.add(20);
        simpleLinkedList.add(30);
        simpleLinkedList.add(40);

        System.out.println(simpleLinkedList);

        reverseLinkedList.reverse(simpleLinkedList);

        System.out.println(simpleLinkedList);



    }
}