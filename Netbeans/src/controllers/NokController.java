/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import db.DBConnection;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Nok;

/**
 *
 * @author Dell
 */
public class NokController {

    public static boolean  addNok(Nok nok) throws SQLException, ClassNotFoundException {
        String sql="insert into nok value(?,?,?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, nok.getSid());
        stm.setObject(2, nok.getName());
        stm.setObject(3, nok.getRelation());
        stm.setObject(4, nok.getAddress());
        stm.setObject(5, nok.getTele());
        stm.setObject(6, nok.getMobile());
        return stm.executeUpdate()>0;
    }

    public static Nok searchNok(String sid) throws SQLException, ClassNotFoundException {
        String sql="select * from nok where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1,sid );
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Nok(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
        }
        return null;

        
    }

    public static boolean UpdateNok(Nok nok) throws SQLException, ClassNotFoundException {
        String sql="Update nok set name=?, relation=?,address=?,telephone=?,mobile=? where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(6, nok.getSid());
        stm.setObject(1, nok.getName());
        stm.setObject(2, nok.getRelation());
        stm.setObject(3, nok.getAddress());
        stm.setObject(4, nok.getTele());
        stm.setObject(5, nok.getMobile());
        return stm.executeUpdate()>0;
        
    }

    

    
    
}
