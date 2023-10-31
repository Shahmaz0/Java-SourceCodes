package com.shahma.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertLast(18);
        list.insert(100, 3);
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
//        System.out.println(list.deleteFirst());
        list.display();
    }
}
