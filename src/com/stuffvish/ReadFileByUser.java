package com.stuffvish;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vishal Pandey
 */

public class ReadFileByUser {
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the String: ");
        String str = sc.nextLine();

        FileWriter fw=new FileWriter("output.txt");

        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        System.out.println("Writing successful");
        fw.close();

        FileReader fr = new FileReader("output.txt");
        for (int i=0; i< str.length(); i++) {
            int j = fr.read();
            System.out.print((char) j);
        }
    }
}

////STEP 1. Import required packages
//import java.sql.*;
//
//public class JDBCExample {
//    // JDBC driver name and database URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//    static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
//
//    //  Database credentials
//    static final String USER = "username";
//    static final String PASS = "password";
//
//    public static void main(String[] args) {
//        Connection conn = null;
//        Statement stmt = null;
//        try{
//            //STEP 2: Register JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
//
//            //STEP 3: Open a connection
//            System.out.println("Connecting to a selected database...");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            System.out.println("Connected database successfully...");
//
//            //STEP 4: Execute a query
//            System.out.println("Inserting records into the table...");
//            stmt = conn.createStatement();
//
//            String sql = "INSERT INTO Registration " +
//                    "VALUES (100, 'Zara', 'Ali', 18)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Registration " +
//                    "VALUES (101, 'Mahnaz', 'Fatma', 25)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Registration " +
//                    "VALUES (102, 'Zaid', 'Khan', 30)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Registration " +
//                    "VALUES(103, 'Sumit', 'Mittal', 28)";
//            stmt.executeUpdate(sql);
//            System.out.println("Inserted records into the table...");
//
//        }catch(SQLException se){
//            //Handle errors for JDBC
//            se.printStackTrace();
//        }catch(Exception e){
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        }finally{
//            //finally block used to close resources
//            try{
//                if(stmt!=null)
//                    conn.close();
//            }catch(SQLException se){
//            }// do nothing
//            try{
//                if(conn!=null)
//                    conn.close();
//            }catch(SQLException se){
//                se.printStackTrace();
//            }//end finally try
//        }//end try
//        System.out.println("Goodbye!");
//    }//end main
//
//        Connecting to a selected database...
//        Connected database successfully...
//        Inserting records into the table...
//        Inserted records into the table...
//        Goodbye!






