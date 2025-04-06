package src.main.java.com.data.structures.algorithm.sorting;

import src.main.java.utils.CommonUtils;
import src.main.java.utils.Input;
import src.main.java.utils.Output;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] arr = Input.arrayInputWithLength();
        insertionSort(arr, arr.length);
        Output.printElementsInArray(arr);
    }

    private static void insertionSort(Integer[] arr, int n) {
        for(int i = 0 ; i < n ; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]) {
                CommonUtils.swap(arr, j, j - 1);
                j--;
            }
        }
    }
}
