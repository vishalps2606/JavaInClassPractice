package com.stuffvish;

import java.io.File;
import java.util.Date;

class GetLastModifiedTime {
    public static void main(String[] args) {
        File newFile = new File("abc.txt");
        Date date = new Date(newFile.lastModified());
        System.out.println("The last modified date is: " + date);
    }
}