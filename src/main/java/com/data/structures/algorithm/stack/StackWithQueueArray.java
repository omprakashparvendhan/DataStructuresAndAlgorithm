package src.main.java.com.data.structures.algorithm.stack;

public class StackWithQueueArray {

    int start = -1;
    int end = -1;
    int[] arr;
    int size = 0;

    StackWithQueueArray(int length) {
        arr = new int[length];
    }

    public void enqueue(int data) {
        if(size + 1 > arr.length ) throw new ArrayIndexOutOfBoundsException();
        if(size == 0) {
            start++; end++;
            arr[start] = data;
        } else {
            end++;
            end = end % arr.length;
            arr[end] = data;
            int count = 0;
            int tempEnd = end;
            while(count < size) {
                end++;
                end = end % arr.length;
                arr[end] = arr[start];
                start++;
                start = start % arr.length;
                count++;
            }
            start = tempEnd;
        }
        size++;
    }

    public int dequeue() {
        if(size == 0) throw new RuntimeException("Queue is Empty");
        int element = arr[start];
        start++;
        start = start % arr.length;
        size--;
        if(size==0) {
            start = -1;
            end = -1;
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
