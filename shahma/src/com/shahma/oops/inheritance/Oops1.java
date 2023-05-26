package com.shahma.oops.inheritance;

public class Oops1 {
    public static void main(String[] args) {

        final A shahma = new A("Abu Shahma");
        shahma.name = "Other name";

        // when a non primitive is final, you cannot reassign it
//        shahma = new A("new object");

    }


}
class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
