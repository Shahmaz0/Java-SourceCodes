package com.shahma.oops.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle created
    // hence it is overriding the parent method
    @Override // This is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
