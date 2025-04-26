package src.main.java.com.data.structures.algorithm.queue;

public class QueueApp {
    public static void main(String[] args) {
//        QueueImplementationLinkedList q = new QueueImplementationLinkedList();
//        q.enqueue(4);
//        q.enqueue(5);
//        q.enqueue(6);
//        System.out.println(q.dequeue());
//        System.out.println(q.front());
//        System.out.println(q.dequeue());
//        System.out.println(q.start.getData());

//        QueueWithStackArray stack = new QueueWithStackArray(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        QueueWithStackLL stack = new QueueWithStackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
