package com.stuffvish;

import java.util.Scanner;

/**
 *
 * @author vishal Pandey
 */

public class Exp3_2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numerator: ");
        int a = sc.nextInt();
        System.out.println("Enter the denominator: ");
        int b = sc. nextInt();
        try {
            int result = a / b;
            if (result%2 == 0){
                throw new RuntimeException("Number is even");
            }else{
                throw new RuntimeException("Number is odd");
            }
        }catch (ArithmeticException ae){
            System.out.println("ArithmeticException: Denominator never be negative");
        }
    }
}
