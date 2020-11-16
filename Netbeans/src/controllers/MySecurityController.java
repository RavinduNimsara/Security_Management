/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class MySecurityController {

    public static String confirmEntry(String text) throws SQLException, ClassNotFoundException {
        String sql = "select * from userAccounts where userName=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(2);
        }else{
            return null;
        }

    }

    public static int  addNewAccount(String text, String text0) throws SQLException, ClassNotFoundException {
        String sql1="select * from userAccounts where userName=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql1);
        stm.setObject(1, text);
        ResultSet rst = stm.executeQuery();
       
        
        
        
        
        if (rst.next()) {
            return -1;
        }
        
        
        
        
        
        
        
        String sql2="insert into userAccounts value(?,?)";
        PreparedStatement stm2=connection.prepareStatement(sql2);
        stm2.setObject(1, text);
        stm2.setObject(2, text0);
        return stm2.executeUpdate();
        
        
        
        
        
    }

}
