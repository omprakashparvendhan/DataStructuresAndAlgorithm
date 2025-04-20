package src.main.java.com.data.structures.algorithm.linkedlist;

import src.main.java.com.data.structures.algorithm.linkedlist.types.DoublyLinkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);
        doublyLinkedList.add(3);
        doublyLinkedList.print();
        doublyLinkedList.reverse();
        doublyLinkedList.print();
        //System.out.println(doublyLinkedList.getHEAD().getNextD().getPrevD().getData());
    }

}
