package src.main.java.com.data.structures.algorithm.queue;

public class QueueWithStackArray {
    int stackOneSize = 0;
    int stackTwoSize = 0;
    int topOne = -1;
    int topTwo = -1;
    int[] stackOne;
    int[] stackTwo;
    int totalSize = 0;

    QueueWithStackArray(int length) {
        stackOne = new int[length];
        stackTwo = new int[length];
    }

    public void push(int data) {
        topOne++;
        stackOne[topOne] = data;
        stackOneSize++;
        totalSize++;
    }

    public int pop() {
        if(stackTwoSize > 0) {
            int element  = stackTwo[topTwo];
            topTwo--;
            return element;
        }
        while(stackOneSize > 0) {
            topTwo++;
            stackTwo[topTwo] = stackOne[topOne];
            topOne--;
            stackOneSize--;
            stackTwoSize++;
        }
        int element = stackTwo[topTwo];
        topTwo--;
        stackTwoSize--;
        totalSize--;
        return element;
    }


}
