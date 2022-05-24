package com.ISLab;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array elements: ");
        for(int i = 0; i < n; i++)
            arr[i] =sc.nextInt();

        System.out.println("The Elements present at even places are- ");
        for(int i = 1; i < n; i += 2){
            System.out.print(arr[i] + ", ");
        }
    }
}
