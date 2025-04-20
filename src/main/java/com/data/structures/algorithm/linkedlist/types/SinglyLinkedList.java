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
            size++;
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
        while (Objects.nonNull(itr)) {
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
        Node<T> prev = null;
        while(Objects.nonNull(itr)) {
            if(Objects.equals(itr.getData(), data)) {
                if(Objects.isNull(prev)) {
                    HEAD = itr.getNext();
                } else {
                    prev.setNext(itr.getNext());
                }
                size--;
                return;
            } else {
                prev = itr;
            }
            itr = itr.getNext();
        }
    }

    public void deleteAll(T data) {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is NULL");
        Node<T> itr = HEAD;
        Node<T> prev = null;
        while (Objects.nonNull(itr)) {
            if(Objects.equals(itr.getData(), data)) {
                if(Objects.isNull(prev)) {
                    HEAD = itr.getNext();
                } else {
                    prev.setNext(itr.getNext());
                }
                size--;
            } else {
                prev = itr;
            }
            itr = itr.getNext();

        }
    }

    public boolean contains(T data) {
        if(Objects.isNull(HEAD)) throw  new RuntimeException("HEAD is null");
        Node<T> itr = HEAD;
        while (Objects.nonNull(itr)) {
            if(itr.getData().equals(data)) {
                return true;
            }
            itr = itr.getNext();
        }
        return false;
    }

    public void reverse() {
        if(Objects.isNull(HEAD)) throw new RuntimeException("HEAD is null");
        Node<T> tempHead = null;
        while(Objects.nonNull(HEAD)) {
            Node<T> next = HEAD.getNext();
            HEAD.setNext(tempHead);
            tempHead = HEAD;
            HEAD = next;
        }
        HEAD = tempHead;
    }

    public static <T> void staticReverse(Node<T> head) {
        if(Objects.isNull(head)) throw new RuntimeException("HEAD is null");
        Node<T> tempHead = null;
        while(Objects.nonNull(head)) {
            Node<T> next = head.getNext();
            head.setNext(tempHead);
            tempHead = head;
            head = next;
        }
        head = tempHead;
    }

    public void sort() {
        HEAD = mergeSort(HEAD);
    }

    private Node<T> mergeSort(Node<T> head) {
        if(Objects.isNull(head) || Objects.isNull(head.getNext())) return head;
        Node<T> middle = findMiddle(head);
        Node<T> left = head;
        Node<T> right = middle.getNext();
        middle.setNext(null);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private Node<T> findMiddle(Node<T> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node<T> slow = head;
        Node<T> fast = head.getNext();
        while(Objects.nonNull(fast) && Objects.nonNull(fast.getNext())) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    private Node<T> merge(Node<T> left, Node<T> right) {
        Node<T> temp = new Node<T>();
        temp.setData(null);
        Node<T> res = temp;
        while(Objects.nonNull(left) && Objects.nonNull(right)) {
            if(left.getData() instanceof Integer) {
                if(Integer.parseInt(left.getData().toString()) <= Integer.parseInt(right.getData().toString())) {
                    res.setNext(left);
                    left = left.getNext();
                } else {
                    res.setNext(right);
                    right = right.getNext();
                }
                res = res.getNext();
            }
        }

        while(Objects.nonNull(left)) {
            res.setNext(left);
            res = res.getNext();
            left = left.getNext();
        }
        while(Objects.nonNull(right)) {
            res.setNext(right);
            res = res.getNext();
            right = right.getNext();
        }
        return temp.getNext();
    }
}
