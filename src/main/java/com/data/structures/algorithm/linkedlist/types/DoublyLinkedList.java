package src.main.java.com.data.structures.algorithm.linkedlist.types;

import src.main.java.com.data.structures.algorithm.linkedlist.common.DNode;

import java.util.Objects;

public class DoublyLinkedList<T> {
    private DNode<T> HEAD;
    public int size;

    public DNode<T> getHEAD() {
        return HEAD;
    }

    public DoublyLinkedList(){

    }

    DoublyLinkedList(T data) {
        HEAD = new DNode<>();
        HEAD.setData(data);
    }

    public void add(T data) {
        DNode<T> temp = new DNode<>();
        temp.setData(data);
        if(Objects.isNull(HEAD)) {
            HEAD = temp;
            size++;
            return;
        }
        DNode<T> itr = HEAD;
        while(Objects.nonNull(itr.getNextD())) {
            itr = itr.getNextD();
        }
        itr.setNextD(temp);
        temp.setPrevD(itr);
    }

    public void print() {
        if(Objects.isNull(HEAD)) throw  new RuntimeException("HEAD is null");
        DNode<T> itr = HEAD;
        while(Objects.nonNull(itr.getNextD())) {
            System.out.print(itr.getData() + " -> ");
            itr = itr.getNextD();
        }
        System.out.print(itr.getData() + " -> NULL");
        System.out.println();
    }

    public void delete(T data) {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is null");
        DNode<T> itr = HEAD;
        while(Objects.nonNull(itr)) {
            if(Objects.equals(itr.getData(), data)) {
                if(Objects.isNull(itr.getPrevD())) {
                    HEAD = itr.getNextD();
                    HEAD.setPrevD(null);
                } else {
                    itr.getPrevD().setNextD(itr.getNextD());
                    if(Objects.nonNull(itr.getNextD())) {
                        itr.getNextD().setPrevD(itr.getPrevD());
                    }
                }
                size--;
                return;
            }
            itr = itr.getNextD();
        }
    }

    public void deleteAll(T data) {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is null");
        DNode<T> itr = HEAD;
        while(Objects.nonNull(itr)) {
            if(Objects.equals(itr.getData(), data)) {
                if(Objects.isNull(itr.getPrevD())) {
                    HEAD = itr.getNextD();
                    HEAD.setPrevD(null);
                } else {
                    itr.getPrevD().setNextD(itr.getNextD());
                    if(Objects.nonNull(itr.getNextD())) {
                        itr.getNextD().setPrevD(itr.getPrevD());
                    }
                }
                size--;
            }
            itr = itr.getNextD();
        }
    }

    public void insert(int index, T data) {
        if(index >= size) throw  new RuntimeException("Invalid Index. Size is :: " +size );
        DNode<T> node = new DNode<>();
        node.setData(data);
        if(Objects.isNull(HEAD)) {
            HEAD = node;
            size++;
            return;
        }
        DNode<T> itr = HEAD;
        int counter = 0;
        while(Objects.nonNull(itr)) {
            if(counter == index) {
                if(Objects.isNull(itr.getPrevD())) {
                    node.setNextD(HEAD);
                    HEAD.setPrevD(node);
                    HEAD = node;
                } else {
                    itr.getPrevD().setNext(node);
                    node.setPrevD(itr);
                    node.setNextD(itr.getNextD());
                }
                size++;
                return;
            }
            counter++;
            itr = itr.getNextD();
        }
    }

    public void update(int index, T data) {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is null");
        if(index >= size )throw new RuntimeException("Invalid Index. Size is :: " +size );
        DNode<T> temp = new DNode<>();
        temp.setData(data);
        int counter = 0;
        DNode<T> itr = HEAD;
        while (Objects.nonNull(itr)) {
            if(counter == index) {
                itr.setData(data);
                return;
            }
        }
    }

    public void reverse() {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is null");
        DNode<T> tempHead = null;
        while(Objects.nonNull(HEAD)) {
            DNode<T> next = HEAD.getNextD();
            HEAD.setNextD(tempHead);
            HEAD.setPrevD(next);
            tempHead = HEAD;
            HEAD = next;
        }
        HEAD = tempHead;
    }

}
