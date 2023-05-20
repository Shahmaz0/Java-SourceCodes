package com.shahma.maths;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(num(22));
    }

    static String num(int n) {
        if ((n & 1) == 1){
            return "odd";
        }
        else{
            return "even";
        }
    }
}
