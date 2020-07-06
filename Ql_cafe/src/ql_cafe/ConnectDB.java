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


/**
 *
 * @author Thang Mi
 */
public class ConnectDB {

    public static Connection dbConnector() throws SQLException {
        Connection conn = null;
        
            // db parameters
            String url = "jdbc:mysql://localhost:3306/qlcafe";
            String Username = "root";
            String Password = "";
            try {
                Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           }
            // create a connection to the database
            conn = (Connection)DriverManager.getConnection(url,Username,Password);
            
            System.out.println("Connection to SQLite has been established.");
        
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    
}
