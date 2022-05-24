package com.stuffvish;

import java.util.Scanner;

public class Area {
    int length;
    int breadth;
    public Area(int l, int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}

class Ans1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int l,b;

        System.out.println("Enter length: ");
        l = s.nextInt();
        System.out.println("Enter breadth: ");
        b = s.nextInt();

        Area a = new Area(l,b);
        System.out.println("Area : " + a.getArea());
    }
}
