package com.Automobile;

import java.util.Scanner;

public class Test{
    public static void main(String args[]){
        int choice;
        Scanner input=new Scanner(System.in);
        System.out.println("1. Hero");
        System.out.println("2. Honda");
        System.out.print("Enter Choice:");
        choice=input.nextInt();
        switch(choice){
            case 1:
                Vehicle obj=new Hero();
                Hero obj1=new Hero();
                obj1.Hero1();
                System.out.println("Model Name:"+obj.getM());
                System.out.println("Registration Number:"+obj.getR());
                System.out.println("Owner Name:"+obj.getO());
                System.out.println("Speed:"+obj1.getS());
                obj1.radio();
                break;

            case 2:
                Vehicle obj2=new Honda();
                Honda obj3=new Honda();
                obj3.Honda1();
                System.out.println("Model Name:"+obj2.getM());
                System.out.println("Registration Number:"+obj2.getR());
                System.out.println("Owner Name:"+obj2.getO());
                System.out.println("Speed:"+obj3.getS());
                obj3.cdPlayer();
                break;

            default:
                System.out.println("Wrong Choice");
        }
    }
}
