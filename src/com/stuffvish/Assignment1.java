package com.stuffvish;

import java.util.Scanner;

public class Assignment1 {
    /*
    * Name - Vishal Pandey
    *  UID - 2930
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First character: ");
        char str1 = sc.nextLine().charAt(0);

        System.out.println("Enter second character: ");
        char str2 = sc.nextLine().charAt(0);

        System.out.println("Output is -> ");
        if(str1 > str2){
            System.out.println(str2 +"," + str1);
        }
        else
            System.out.println(str1 + "," + str2);

        sc.close();
    }

    

//    public static String wordEnds(String str, String word) {
//        StringBuilder newStr = new StringBuilder();
//        if(str.length() < 2 || word.length() == 0)
//            return "";
//        str = str.replace(word, ".");
//
//        if(str.length() >= 2){
//            for(int i = 1; i < str.length()-1; i++){
//                if(str.charAt(i) != '.'){
//                    if(str.charAt(i-1) =='.')
//                        newStr.append(str.charAt(i));
//                    if(str.charAt(i+1) == '.')
//                        newStr.append(str.charAt(i));
//                }
//                if(str.charAt(i) == '.'){
//                    if(str.charAt(i-1) =='.')
//                        newStr.append(word);
//                    if(str.charAt(i+1) == '.')
//                        newStr.append(word);
//                }
//            }
//            if(str.charAt(0) != '.')
//                if(str.charAt(1) == '.')
//                    newStr.insert(0, str.charAt(0) + "");
//
//            boolean b = str.charAt(str.length() - 2) == '.';
//            if(str.charAt(str.length()-1) != '.')
//                if(b)
//                    newStr.append(str.charAt(str.length() - 1));
//            if(str.charAt(str.length()-1) == '.')
//                if(b)
//                    newStr.append(word);
//
//        }
//        return newStr.toString();
//    }
}
