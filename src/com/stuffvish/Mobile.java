package com.stuffvish;

public class Mobile {
    public double model_no, price;
    public String brand;

    public Mobile(double model_no, double price, String brand){
        this.brand = brand;
        this.model_no = model_no;
        this.price = price;
    }
}
class Main{

    public static void main(String[] args) {
        Mobile m1 = new Mobile(7124, 9999, "Realme");
        System.out.println(m1);
    }
}
