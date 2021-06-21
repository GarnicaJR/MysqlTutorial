/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mysqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jgarnica
 */
public class StartConfigApp {
    
    public static void main(String[] args) {
        Connection connection = null;
        String jdbc = "jdbc:mysql://localhost:3306/tutorial";
        
        try {
            connection = DriverManager.getConnection(jdbc, "root", "root");
            System.out.println("Connection has been reached sucessfully");
            
        } catch (SQLException ex) {
            
            System.err.println("Somethign went wrong trying connect to database "+ex.toString());
        }
        finally{
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println("Something went wroing trying close the connection "+ex.toString());
                }
            }
        }
    }
    
}
