/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author haque
 */
import java.sql.*;
import javax.swing.*;
public class DatabaseHelper {
    Connection conn=null;
    
    
    
    public static Connection getConnection(){
    
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "123");
             //JOptionPane.showMessageDialog(null, "Connection established");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}
