package src.main.java.com.data.structures.algorithm.linkedlist.types;

import src.main.java.com.data.structures.algorithm.linkedlist.common.Node;

import java.util.Collection;
import java.util.Objects;

public class SinglyLinkedList<T> {

    private Node<T> HEAD;
    public int size = 0;

    public Node<T> getHEAD() {
        return HEAD;
    }

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(T data) {
        HEAD = createNode(data);
        size++;
    }

    public void add(T data) {
        Node<T> temp = createNode(data);
        if(Objects.isNull(HEAD)) {
            HEAD = temp;
            return;
        }
        Node<T> itr = HEAD;
        while(Objects.nonNull(itr.getNext())) {
            itr = itr.getNext();
        }
        itr.setNext(temp);
        size++;
    }

    public void insert(T data) {
        Node<T> temp = createNode(data);
        temp.setNext(HEAD);
        HEAD = temp;
        size++;
    }

    public void insert(int index, T data) {
        if(index > size) throw new RuntimeException("Cannot be more than the linked list size");
        Node<T> temp = createNode(data);
        if(Objects.isNull(HEAD) || index == 0) {
            temp.setNext(HEAD);
            HEAD = temp;
            size++;
            return;
        }
        int counter = 0;
        Node<T> itr = HEAD;
        while (Objects.nonNull(itr.getNext())) {
            if(counter == index - 1) break;
            itr = itr.getNext();
            counter++;
        }
        temp.setNext(itr.getNext());
        itr.setNext(temp);
        size++;
    }

    private Node<T> createNode(T data) {
        Node<T> node = new Node<>();
        node.setData(data);
        return node;
    }

    public void print() {
        if(Objects.isNull(HEAD)) {
            System.out.println("NULL");
            return;
        }
        Node<T> itr = HEAD;
        while(Objects.nonNull(itr.getNext())) {
            System.out.print( itr.getData() + " -> ");
            itr = itr.getNext();
        }
        System.out.print(itr.getData() + " -> NULL");
        System.out.println();
    }

    public void add(T[] datas) {
        for(T t : datas) {
            add(t);
        }
    }

    public void add(Collection<T> datas) {
        for(T t : datas) {
            add(t);
        }
    }

    public void delete(T data) {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is NULL");
        Node<T> itr = HEAD;
        if(itr.getData() == data) {
            HEAD = itr.getNext();
            size--;
            return;
        }
        while(Objects.nonNull(itr.getNext().getNext())) {
            if(itr.getNext().getData() == data) break;
            itr = itr.getNext();
        }
        if(itr.getNext().getData() == data) {
            itr.setNext(itr.getNext().getNext());
            size--;
        }
    }
}
