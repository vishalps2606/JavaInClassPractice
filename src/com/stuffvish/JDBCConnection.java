package com.stuffvish;

import java.io.IOException;
import java.sql.*;

public class JDBCConnection {
    /*
     * Name- Vishal Pandey
     * UID - 19BCS2930
     */
    public static void main(String[] args) throws SQLException, IOException {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbname",
                    "username", "********"
            );
            System.out.println("Connection Established successfully");
        } catch (Exception e) {
            System.out.println("Connection could  not be established");
        } finally {
            if (conn != null)
                conn.close();
        }
    }
}
