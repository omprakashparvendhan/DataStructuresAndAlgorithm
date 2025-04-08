package src.main.java.utils;

import java.util.Scanner;

public class Input {
    public static Integer[] arrayInputWithLength() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }
}
