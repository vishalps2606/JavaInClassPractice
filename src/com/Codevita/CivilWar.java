package com.Codevita;

import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            boolean check = true;
            int[] arr = new int[n+1];
            for(int i=1;i<=n;i++){
                if((i-k)>=1 && arr[i-k]==0){
                    arr[i-k] = i;
                }
                else if((i+k)<=n && arr[i+k]==0){
                    arr[i+k] = i;
                }
                else{
                    check = false;
                    break;
                }
            }
            if(!check){
                System.out.println("CAPTAIN AMERICA EVADES");
            }
            else{
                for(int i=1;i<=n;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println("");
            }
            t--;
        }
    }
}

