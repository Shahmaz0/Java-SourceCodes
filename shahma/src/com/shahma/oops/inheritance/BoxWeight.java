package com.shahma.oops.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    // ditto same concept as explained before in main class
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (Double side, Double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // What is this? call the parent class constructor
        //used to initialize values present in parent class.
        this.weight = weight;
    }
}

// Super class variable can be used to reference any obj from that Derived class
// hence, we are able to pass boxWeight object to the box constructor.