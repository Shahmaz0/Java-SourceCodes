package com.shahma.maths;

public class Unique {
    public static void main(String[] args) {
        int[] arr ={-2, -3, -3, -2, -6, -5, -5};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr){
        int ans = 0;
        for (int i:arr) {
            ans ^= i;
        }
        return ans;
    }
}

