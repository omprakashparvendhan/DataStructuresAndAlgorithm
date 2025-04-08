package src.main.java.com.data.structures.algorithm.sorting;

import src.main.java.utils.Input;
import src.main.java.utils.Output;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] arr = Input.arrayInputWithLength();
        mergeSort(arr, 0, arr.length - 1);
        Output.printElementsInArray(arr);
    }

    private static void mergeSort(Integer[] arr, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(Integer[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while(right <= mid) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low ; i <= high ; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
