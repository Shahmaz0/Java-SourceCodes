package com.shahma;

import java.util.ArrayList;

public class TargetArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 4, 4, 13};
        int target = 13;
//        System.out.println(search(arr, target, 0));
//        System.out.println(findIndex(arr, target,0 ));
//        System.out.println(findIndexLast(arr, target,arr.length - 1 ));
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex1(arr,4, 0, list);
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    static boolean search(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || search(arr, target, index+1);
    }


    //print target index from start
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else
            return findIndex(arr, target, index+1);
    }
    //print index from last
    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else
            return findIndexLast(arr, target, index-1);
    }




    //find all the index
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    // Returning arraylist
    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);
    }

    //Returning list without passing arraylist in arguments

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;

    }
}