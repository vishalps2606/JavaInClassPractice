package com.stuffvish;

import java.util.Scanner;

public class WordStartEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of testCases");
        int t = sc.nextInt();

        while(t-- > 0){
            sc.nextLine();
            System.out.println("Enter the String: ");
            String str = sc.nextLine();

            System.out.println("Enter the word: ");
            String word = sc.nextLine();

            String newStr = wordEnds(str, word);

            System.out.println(newStr);
        }
    }
    public static String wordEnds(String str, String word) {
        StringBuilder newStr = new StringBuilder();
        if(str.length() < 2 || word.length() == 0)
            return "";
        str = str.replace(word, ".");

        if(str.length() >= 2){
            for(int i = 1; i < str.length()-1; i++){
                if(str.charAt(i) != '.'){
                    if(str.charAt(i-1) =='.')
                        newStr.append(str.charAt(i));
                    if(str.charAt(i+1) == '.')
                        newStr.append(str.charAt(i));
                }
                if(str.charAt(i) == '.'){
                    if(str.charAt(i-1) =='.')
                        newStr.append(word);
                    if(str.charAt(i+1) == '.')
                        newStr.append(word);
                }
            }
            if(str.charAt(0) != '.')
                if(str.charAt(1) == '.')
                    newStr.insert(0, str.charAt(0) + "");

            if(str.charAt(str.length()-1) != '.')
                if(str.charAt(str.length()-2) == '.')
                    newStr.append(str.charAt(str.length() - 1));

            if(str.charAt(str.length()-1) == '.')
                if(str.charAt(str.length()-2) == '.')
                    newStr.append(word);
        }

        return newStr.toString();
    }
}
