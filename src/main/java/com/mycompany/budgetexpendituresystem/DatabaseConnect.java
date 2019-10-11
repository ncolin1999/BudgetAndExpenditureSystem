/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.budgetexpendituresystem;

/**
 *
 * @author ncolin
 */
import java.sql.*;
import javax.swing.*;

public class DatabaseConnect {
    private static Connection conn = null;
    public static Connection connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+System.getProperty("user.dir")+"/src/main/java/com/mycompany/budgetexpendituresystem/resources/BudgetExpense.db");
            return conn;
            
        }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
    }
    
}