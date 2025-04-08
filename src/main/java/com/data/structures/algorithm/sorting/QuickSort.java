package src.main.java.com.data.structures.algorithm.sorting;

import src.main.java.utils.CommonUtils;
import src.main.java.utils.Input;
import src.main.java.utils.Output;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = Input.arrayInputWithLength();
        quickSort(arr, 0, arr.length - 1);
        Output.printElementsInArray(arr);
    }

    private static void quickSort(Integer[] arr, int low, int high) {
        if(low < high) {
            int partitionIndex = partition(arr, low, high); // element which is in this position is at the right position
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(Integer[] arr, int low, int high) {
        // i = low + 1. we can easily return j. because once j and i crosses, the partition Index is j.
        int i = low + 1;
        int j = high;
        int pivot = arr[low];
        while(i <= j) {
            while( i <= high && arr[i] < pivot) i++;
            while( j >= low + 1 && arr[j] > pivot) j--;
            if(i < j) {
                CommonUtils.swap(arr, i, j);
                i++; j--;
            }
        }
        CommonUtils.swap(arr, low, j); // finally swap the pivot in the jth position. since jth index will have an element less than pivot
        return j;
    }


}
