package com.Codevita;

import java.util.Scanner;

public class Polygon {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        long[] x = new long[t];
        long[] y = new long[t];

        for(int i = 0; i < t; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println(polygonArea(x,y,t));
        sc.close();
    }
    public static long polygonArea(long[] X, long[] Y, int n){
        double area = 0;
        int j = n - 1; //j = 3
        for (int i = 0; i < n; i++)
        {
            area += Math.abs((X[j] + X[i]) * (Y[j] - Y[i])); // (2+0)*(2-0) = 4;
            j = i;
        }
        return (long)Math.abs(area);
    }
}