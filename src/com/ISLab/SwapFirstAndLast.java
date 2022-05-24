package com.ISLab;

import java.util.Scanner;

public class SwapFirstAndLast{

    public static void main(String[] args){

        /*
         * Name - Vishal Pandey
         * UID - 19BCS2930
         */
        int num, temp, digits=0, rev=0, r, digitsTemp;
        Scanner scan = new Scanner(System.in);

        System.out.print("\n Enter the Number: ");
        num = scan.nextInt();

        for(temp=num; temp>0; temp /= 10)
            digits++;

        for(temp=num; temp>0; temp /= 10)
            rev = (rev*10) + (temp%10);

        r = rev;
        rev = 0;
        digitsTemp = digits;
        for(temp=num; temp>0; temp /= 10){

            if(digitsTemp==digits || digitsTemp==1)
                rev = (rev*10) + (temp%10);
            else
                rev = (rev*10) + (r%10);
            r = r/10;
            digitsTemp--;
        }
        System.out.println("\nThe new number = " +rev);
        System.out.println("First and Last Digit Interchanged Successfully!");
    }
}
