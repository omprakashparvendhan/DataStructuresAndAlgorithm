package src.main.java.com.data.structures.algorithm.linkedlist.common;

public class DNode<T> extends Node<T> {
    private DNode<T> prevD;
    private DNode<T> nextD;

    public DNode<T> getPrevD() {
        return prevD;
    }

    public void setPrevD(DNode<T> prevD) {
        this.prevD = prevD;
    }

    public DNode<T> getNextD() {
        return nextD;
    }

    public void setNextD(DNode<T> nextD) {
        this.nextD = nextD;
    }
}
