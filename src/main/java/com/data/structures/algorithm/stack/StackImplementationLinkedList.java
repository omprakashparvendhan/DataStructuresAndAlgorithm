package src.main.java.com.data.structures.algorithm.stack;

import src.main.java.com.data.structures.algorithm.linkedlist.common.Node;

public class StackImplementationLinkedList {

    int size = 0;
    Node<Integer> top = null;

    public void push(int data) {
        Node<Integer> temp = new Node<>();
        temp.setData(data);
        temp.setNext(top);
        top = temp;
        size++;
    }

    public int pop() {
        if(size == 0) throw new RuntimeException("Stack is empty");
        int element = top.getData();
        top = top.getNext();
        size--;
        return element;
    }

    public int top() {
        if(size == 0) throw new RuntimeException("Stack is empty");
        return top.getData();
    }

    public int getSize() {
        return size;
    }
}
