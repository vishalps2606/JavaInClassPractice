package com.stuffvish;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilterReader {
    public static void main(String[] args) {
        try{
            FileOutputStream obj1 = new FileOutputStream("abc.txt");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            byte[] b = str.getBytes();
            obj1.write(b);
            obj1.close();
            System.out.println("Successful");
            FileInputStream obj2 = new FileInputStream("abc.txt");

            for (int i = 0; i < str.length(); i++)
            {
                int j = obj2.read();
                System.out.print((char)j);
            }
        }catch (IOException e){
            System.out.println("File not found");
        }
    }
}
