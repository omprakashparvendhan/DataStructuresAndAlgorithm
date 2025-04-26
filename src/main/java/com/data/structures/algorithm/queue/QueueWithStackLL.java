package src.main.java.com.data.structures.algorithm.queue;

import src.main.java.com.data.structures.algorithm.linkedlist.common.Node;

import java.util.Objects;

public class QueueWithStackLL {
    int size = 0;
    Node<Integer> topOne = null;
    Node<Integer> topTwo = null;

    public void push(int data) {
        Node<Integer> temp = new Node<>();
        temp.setData(data);
        temp.setNext(topOne);
        topOne = temp;
        size++;
    }

    public int pop() {
       if(topTwo == null && topOne == null) throw new RuntimeException("Stack is Empty");
       if(topTwo == null) {
           Node<Integer> tempHead = null;
           while(Objects.nonNull(topOne)) {
               Node<Integer> next = topOne.getNext();
               topOne.setNext(tempHead);
               tempHead = topOne;
               topOne = next;
           }
           topTwo = tempHead;
       }
        int element = topTwo.getData();
        topTwo = topTwo.getNext();
        size--;
        return element;
    }

    public int top() {
        if(topTwo == null && topOne == null) throw new RuntimeException("Stack is Empty");
        if (topTwo == null) {
            Node<Integer> tempHead = null;
            while (Objects.nonNull(topOne)) {
                Node<Integer> next = topOne.getNext();
                topOne.setNext(tempHead);
                tempHead = topOne;
                topOne = next;
            }
            topTwo = tempHead;
        }
        return topTwo.getData();
    }

    public int getSize() {
        return size;
    }

}
