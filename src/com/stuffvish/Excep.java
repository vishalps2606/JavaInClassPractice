package com.stuffvish;

public class Excep {
    public static void main(String[] args) {
        try{
            int x = 10, y = 1;
            int ans = x/y;

            System.out.println(ans);
            int n = 4;
            int[] a = new int[n];
            a[1] = 0;
            a[0] = 1;
            a[2] = 2;
            a[3] = 3;

            System.out.println(a[3]);

        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught");
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndex caught");
        }
    }
}
