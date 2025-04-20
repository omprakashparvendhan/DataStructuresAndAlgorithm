package src.main.java.com.data.structures.algorithm.linkedlist.problems;

import src.main.java.com.data.structures.algorithm.linkedlist.common.Node;
import src.main.java.com.data.structures.algorithm.linkedlist.types.SinglyLinkedList;
import src.main.java.utils.Input;

import java.util.Objects;

public class TortoiseAndHare {
    public static void main(String args[]) {
        Integer[] arr = Input.arrayInputWithLength();
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(arr);
        System.out.println(findMiddleElement(linkedList.getHEAD()).getData());
    }

    private static Node<Integer> findMiddleElement(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(Objects.nonNull(fast) && Objects.nonNull(fast.getNext())) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    //isCycleExists
    //MergeSort

    private static boolean isCycleExists(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (Objects.nonNull(fast)) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast) return true;
        }
        return false;

    }


    private static boolean isPalindrome(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (Objects.nonNull(fast) && Objects.nonNull(fast.getNext()) && Objects.nonNull(fast.getNext().getNext())) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        slow = slow.getNext();
        fast = head;
        SinglyLinkedList.staticReverse(slow);
        while(Objects.nonNull(slow)) {
            if (!fast.getData().equals(slow.getData())) return false;
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return true;
    }
}
