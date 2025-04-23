package src.main.java.com.data.structures.algorithm.stack;

public class StackImplementationArray {
    private int size = 0;
    private int top = -1;
    private final int[] arr;

    StackImplementationArray(int capacity) {
        arr = new int[capacity];
    }

    public void push(int data) {
        if(size >= arr.length) throw new ArrayIndexOutOfBoundsException();
        top++;
        arr[top] = data;
        size++;
    }

    public int pop() {
        if(size == 0) throw new RuntimeException("Stack is empty");
        else {
            int element = arr[top];
            top--;
            size--;
            return element;
        }
    }

    public int getTop() {
        if(size == 0) throw new RuntimeException("Stack is empty");
        else return arr[top];
    }

    public int getSize() {
        return size;
    }

}
