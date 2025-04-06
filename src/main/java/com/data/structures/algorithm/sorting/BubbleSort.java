package src.main.java.com.data.structures.algorithm.sorting;

import src.main.java.utils.CommonUtils;
import src.main.java.utils.Input;
import src.main.java.utils.Output;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = Input.arrayInputWithLength();
        //bubbleSort(arr, arr.length);
        optimizedBubbleSort(arr, arr.length);
        Output.printElementsInArray(arr);
    }

    /* Optimized - O(n) for already sorted arrays */
    private static void optimizedBubbleSort(Integer[] arr, int n) {
        for(int i = 0 ; i < n ; i++) {
            boolean isSorted = true;
            for(int j = 0 ; j < n - i - 1 ; j ++) {
                if(arr[j] > arr[j + 1]) {
                    CommonUtils.swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
    }

    private static void bubbleSort(Integer[] arr, int n) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n - i ; j ++) {
                if(arr[i] > arr[j]) CommonUtils.swap(arr, i, j);
            }
        }
    }
}
