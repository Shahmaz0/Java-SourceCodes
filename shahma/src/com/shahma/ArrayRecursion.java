package com.shahma;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int index) {
        //base condition
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index + 1] && sort(arr, index + 1);

    }
}
