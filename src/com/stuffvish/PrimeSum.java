package com.stuffvish;

public class PrimeSum{
    /*
    *
    * @author - Vishal Pandey
    *  UID - 19BCS2930
     */

    public static void main(String[] args){

        int prime_sum = 0;
        for(int i = 10; i <= 99; i++){
            if(isPrime(i))
                prime_sum += i;
        }
        System.out.print("The sum of all prime numbers lies between 10 and 99 is: ");
        System.out.println( "=> " + prime_sum + " <=");
    }
    public static boolean isPrime(int n){

        if(n == 2) return true;
        if(n % 2 == 0)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}