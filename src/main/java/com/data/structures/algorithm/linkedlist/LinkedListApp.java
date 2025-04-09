package src.main.java.com.data.structures.algorithm.linkedlist;

import src.main.java.com.data.structures.algorithm.linkedlist.types.SinglyLinkedList;
import src.main.java.utils.Input;

public class LinkedListApp {
    public static void main(String[] args) {
        Integer[] arr = Input.arrayInputWithLength();
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(arr);
        singlyLinkedList.print();
        singlyLinkedList.delete(Input.inputInteger());
        singlyLinkedList.print();
    }
}
