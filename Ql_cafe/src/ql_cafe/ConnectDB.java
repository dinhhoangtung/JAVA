/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_cafe;

import Models.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Thang Mi
 */
public class ConnectDB {

    
    public static String DB_URL = "jdbc:mysql://localhost:3306/java";
    public static String USER_NAME = "root";
    public static String PASSWORD = "";
    
    
    public static Connection getConnection(String dbURL, String userName, 
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    
}
