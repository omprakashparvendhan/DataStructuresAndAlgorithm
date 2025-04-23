package src.main.java.com.data.structures.algorithm.queue;

public class QueueImplementationArray {
    int start = -1;
    int end = -1;
    int[] arr;
    int size = 0;

    QueueImplementationArray(int size) {
        arr = new int[size];
    }

    public void enqueue(int data) {
        if(size + 1 >= arr.length ) throw new ArrayIndexOutOfBoundsException();
        if(start == -1) {
            start++; end++;
            arr[start] = data;
        } else {
            end ++;
            end = end % arr.length ;
            arr[end] = data;
        }
        size++;
    }

    public int dequeue() {
        if(size == 0) throw new RuntimeException("Queue is Empty");
        int element = arr[start];
        if(size == 1) {
            start = -1;
            end = -1;
            size = 0;
        } else {
            start++;
            start = start % arr.length;
            size--;
        }
        return element;
    }

    public int front() {
        if(size == 0) throw new RuntimeException("Queue is Empty");
        return arr[start];
    }

    public int getSize() {
        return size;
    }
}
