package com.Automobile;

import java.util.Scanner;

public class Hero extends Vehicle{
    public static String a,b,c;
    public static int d;
    public void Hero1(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Model Name:");
        a=input.nextLine();
        System.out.print("Enter Registration number:");
        b=input.nextLine();
        System.out.print("Enter Owner Name:");
        c=input.nextLine();
        System.out.print("Enter Speed:");
        d=input.nextInt();
        System.out.println("\n*****output******");
    }

    public String getM(){
        return a;
    }
    public String getR(){
        return b;
    }
    public String getO(){
        return c;
    }
    public int getS(){
        return d;
    }public void radio(){
        System.out.println("It provides radio facility");
    }
}
