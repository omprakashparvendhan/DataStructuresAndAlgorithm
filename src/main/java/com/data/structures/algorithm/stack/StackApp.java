package src.main.java.com.data.structures.algorithm.stack;

public class StackApp {

    public static void main(String[] args) {
//        StackImplementationLinkedList stack = new StackImplementationLinkedList();
//        stack.push(4);
//        stack.push(5);
//        stack.top();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        StackWithQueueArray queueArray = new StackWithQueueArray(5);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());
        queueArray.enqueue(4);
        queueArray.enqueue(5);

        queueArray.enqueue(6);
        queueArray.enqueue(7);
        System.out.println(queueArray.dequeue());

        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());
        System.out.println(queueArray.dequeue());

    }
}
