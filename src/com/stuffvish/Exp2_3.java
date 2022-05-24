package com.stuffvish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class Exp2_3 {
    public static void main(String[] args) {
        /*
         * Name - Vishal Pandey
         * UID - 19BCS2930
         */
        Scanner sc = new Scanner(System.in);
        Collection<String> list = new ArrayList<>();

        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the String to be added");
                    String s = sc.next();
                    list.add(s);
                    System.out.println("String added successfully");
                }
                case 2 -> {
                    System.out.println("Enter the String to be searched: ");
                    String s = sc.next();
                    if(list.contains(s))
                        System.out.println("Item present in the list");
                    else
                        System.out.println("Item not present");
                }
                case 3 -> {

                    if (list.isEmpty()) {
                        System.out.println("Err: List is Empty. Underflow Condition.");
                        break;
                    }
                    System.out.println("Enter the String to be deleted");
                    String s = sc.next();
                    if(list.contains(s)){
                        list.remove(s);
                        System.out.println("Item present in the list");
                    }
                    else
                        System.out.println("Item not present");
                }
                case 4 ->
                    System.out.println(list);

                default -> System.exit(0);
            }
        }
    }
}
