package com.stuffvish;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employeee implements java.io.Serializable {
    public String name;
    public String address;
    public int number;
}

public class Serialisation {
    public static void main(String[] args) {
        Employeee e = new Employeee();
        e.name = "Vishal Pandey";
        e.address = "Kanpur,UP";
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("abcde.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in abcde.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
