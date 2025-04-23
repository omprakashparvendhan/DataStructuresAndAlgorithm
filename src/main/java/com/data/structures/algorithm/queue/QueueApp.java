package src.main.java.com.data.structures.algorithm.queue;

public class QueueApp {
    public static void main(String[] args) {
        QueueImplementationLinkedList q = new QueueImplementationLinkedList();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.start.getData());
    }
}
