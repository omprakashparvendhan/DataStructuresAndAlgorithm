package src.main.java.com.data.structures.algorithm.linkedlist.common;

public class Node<T> {
    private T data;
    private Node<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
