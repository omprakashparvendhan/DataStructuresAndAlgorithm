package src.main.java.com.data.structures.algorithm.sorting;

import src.main.java.utils.CommonUtils;
import src.main.java.utils.Input;
import src.main.java.utils.Output;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] arr = Input.arrayInputWithLength();
        selectionSort(arr, arr.length);
        Output.printElementsInArray(arr);
    }

    private static void selectionSort(Integer[] arr, int n) {
        for(int i = 0 ; i < n ; i++) {
            int min = i;
            for(int j = i ; j < n ; j ++) {
                if(arr[j] < arr[min]) min = j;
            }
            CommonUtils.swap(arr, i, min);
        }
    }
}
