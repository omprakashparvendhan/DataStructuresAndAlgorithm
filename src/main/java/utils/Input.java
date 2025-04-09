package src.main.java.utils;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static Integer[] arrayInputWithLength() {
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int inputInteger() {
        return scanner.nextInt();
    }
}
