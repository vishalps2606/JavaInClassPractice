package com.stuffvish;

import java.sql.*;

public class JDBC {

    /*
     * Name- Vishal Pandey
     * UID - 19BCS2930
     */
    public static void main(String[] arg){

        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newdb",
                    "root", "Vishal123@");


            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from dogs");
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("age");
                title = resultSet.getString("name").trim();
                System.out.println("Age : " + code
                        + " Name : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
