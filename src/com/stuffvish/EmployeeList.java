package com.stuffvish;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeList {
    /*
     * Name - Vishal Pandey
     * UID - 19BCS2930
     */
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Vishal");
        set.add("Sarthak");
        set.add("Aman");
        set.add("Tarif");
        set.add("Rahul");
        set.add("Dhruv");
        set.add("Bob");
        set.add("Alice");
        set.add("John");
        set.add("Richard");

        System.out.println("\nWe have total " + set.size() + " Employee's with name : ");

        Iterator<String> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
