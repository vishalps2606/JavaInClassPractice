package com.stuffvish;

import java.util.Scanner;

public class generateDay {
    public static void main(String[] args){
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an Integer from 1 to 7: ");
            int intToDay = sc.nextInt();

            switch (intToDay) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> {
                    try {
                        throw new RuntimeException("Invalid Entry, Please enter a no. b/w 1 to 7"); /* System.out.println("Invalid"); */
                    }catch (RuntimeException rte){
                        System.out.println("Exception caught");
                        System.out.println(rte.getMessage());
                    }
                }
            }
            System.out.println("Do you want to cont.: \n press 1 for 'yes' and press 2 for 'no'");
            choice = sc.nextInt();
        }while (choice == 1);
    }
}
