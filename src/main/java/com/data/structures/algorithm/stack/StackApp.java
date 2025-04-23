package src.main.java.com.data.structures.algorithm.stack;

public class StackApp {

    public static void main(String[] args) {
        StackImplementationLinkedList stack = new StackImplementationLinkedList();
        stack.push(4);
        stack.push(5);
        stack.top();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
