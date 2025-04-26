package src.main.java.com.data.structures.algorithm.stack;

import src.main.java.com.data.structures.algorithm.linkedlist.common.Node;

public class StackWithQueueLL {

    int size = 0;
    Node<Integer> start = null;
    Node<Integer> end = null;

    public void enqueue(int data) {
        Node<Integer> temp = new Node<>();
        temp.setData(data);

        if(size == 0) {
            start = temp;
            end = temp;
        } else {
            end.setNext(temp);
            Node<Integer> curr = end;
            end = temp;
            curr.setNext(null);
            end.setNext(start);
            start = end;
            end = curr;
        }
        size++;
    }

    public int dequeue() {
        if(size == 0) throw new RuntimeException("Queue is Empty");
        int element = start.getData();
        start = start.getNext();
        size--;
        if (size == 0) {
            end = null;
        }
        return element;
    }

    public int front() {
        if(size == 0) throw new RuntimeException("Queue is Empty");
        return start.getData();
    }

    public int getSize() {
        return size;
    }
}
