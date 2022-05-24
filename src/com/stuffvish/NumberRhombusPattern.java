package com.stuffvish;

/**
 *
 * @author vishal
 */

public class NumberRhombusPattern {
    public static void main(String[] args) {
        int row = 4, k = 1;
        int counter = 1;

        //top half
//        for (int i = 1; i <= row; i++) {
//            for (int l = row; l > i; l--)
//        {
//            System.out.print(" ");
//        }
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(counter + " ");
//                counter++;
//            }
//            int temp1 = counter - 1;
//            for (int k = 2; k <= i; k++)
//            {
//                System.out.print(--temp1 + " ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= row; i++) {

//            for (int l = 1; l <=i; l++){
//                System.out.print(k + "  ");
//                k++;
//            }

            int reverse = k + counter-1;
            for (int j = 1; j <= i; j++) {
                System.out.print(reverse-- + "   ");
                counter++;
            }

            System.out.println();
            k++;
        }

        //bottom-right Quarter

        for (int i = row-1; i >= 1; i--){
            int reverse = k + counter - 3;

            for (int j = 1; j <= i; j++) {

                System.out.print(reverse-- + "  ");
                counter++;
            }

            System.out.println();
            k -= 2;
            k++;
        }
    }
}
