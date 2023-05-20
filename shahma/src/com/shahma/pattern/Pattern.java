package com.shahma.pattern;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
//        pattern(4, 0);
        int[] arr = {1, 4, 3, 2};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }
    static void pattern(int r, int c) {
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("* ");
            pattern(r, c+1);
        }
        else{
            System.out.println();
            pattern(r-1, 0);
        }
    }

    static void selection(int[] arr, int r, int c, int max) {
        if(r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            }
            else {
                selection(arr, r, c+1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            selection(arr, r - 1, 0, 0);
        }
    }
}
