package com.stuffvish;

import java.util.Scanner;

public class FindLongestWord {
    static int LongestStringLength(String str){

        String[] words = str.split(" ");
        int length = 0;

        for (String word: words){
            if(length<word.length()){
                length = word.length();
            }
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Longest word length is: " + LongestStringLength(str));

    }
}
