package com.stuffvish;
//wap to print rhombus number pattern in java
import java.util.Scanner;

/**
 *
 * @author vishal Pandey
 */

public class rhombusPattern {
    /**
     *
     * @param args rhombus number pattern question
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal of rhombus: ");
        int n = sc.nextInt();
        int l,m,p=0,q=0;
        for(int i=0;i<n;i++)                //cover all rows
        {
            l=i;
            if(l>n/2)
                l=n-1-i;

            for(int k= n-1-l; k>n/2;k--)
                System.out.print("\t");
            for(int j=0;j<=2*l;j++)
            {
                m=j;
                if(m>l)
                {
                    q--;
                    System.out.print( "\t"+q);
                }
                else
                {
                    q=++p;
                    System.out.print("\t"+p);
                }
            }
            for(int k=n-1-l;k>n/2;k--) {
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
