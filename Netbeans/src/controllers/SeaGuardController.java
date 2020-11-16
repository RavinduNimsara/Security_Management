/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.SeaGuard;
import db.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model1.ViewSeaGuard;
import other.IDGenerator;
import view.ViewAllSeaGuards;

/**
 *
 * @author Dell
 */
public class SeaGuardController {

    public static boolean  addSeaGuard(SeaGuard sG) throws SQLException, ClassNotFoundException {
        String sql="insert into seaguard value(?,?,?,?,?,?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        
        stm.setObject(1, sG.getSid());
        stm.setObject(2, sG.getName());
        stm.setObject(3, sG.getTele());
        stm.setObject(4, sG.getMobile());
        stm.setObject(5, sG.getAddress());
        stm.setObject(6, sG.getEmail());
        stm.setObject(7, sG.getDob());
        stm.setObject(8, sG.getAge());
        stm.setObject(9, false);
        return stm.executeUpdate()>0;
        
        
    }

    public static String getNextSid() throws SQLException, ClassNotFoundException {
        String sql="select sid from seaguard order by 1 desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return IDGenerator.getNextId("S",rst.getString(1));
        }
        return IDGenerator.getNextId("S",null);

        
    }

    public static ArrayList<String> getAllSids() throws SQLException, ClassNotFoundException {
        String sql="select sid from SeaGuard";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> sids=new ArrayList<>();
        while (rst.next()) {
            sids.add(rst.getString(1)); 
        }
        return sids;          
    }

    public static SeaGuard searchSeaGuard(String sid) throws SQLException, ClassNotFoundException {
        String sql="select * from seaguard where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, sid);
        ResultSet rst = stm.executeQuery();
        rst.next();
        return new SeaGuard(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7), rst.getString(8));
    }

    public static boolean deleteSeaGuard(String sid) throws SQLException, ClassNotFoundException {
        String sql="delete from seaguard where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1,sid);
        return stm.executeUpdate()>0;
    }

    public static boolean updateSeaGuard(SeaGuard sG) throws SQLException, ClassNotFoundException {
        String sql="update seaguard set name=?,telephone=?,mobile=?,address=?,email=? where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        
        stm.setObject(6, sG.getSid());
        stm.setObject(1, sG.getName());
        stm.setObject(2, sG.getTele());
        stm.setObject(3, sG.getMobile());
        stm.setObject(4, sG.getAddress());
        stm.setObject(5, sG.getEmail());
        
        return stm.executeUpdate()>0;
    }

    public static ArrayList<ViewSeaGuard> getSeaGuards() throws SQLException, ClassNotFoundException {
        String sql="select sid,name,address,docstatues from seaguard";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ViewSeaGuard> v=new ArrayList<>();
        while (rst.next()) {
            v.add(new ViewSeaGuard(rst.getString(1),rst.getString(2),rst.getString(3),rst.getBoolean(4)));
        }
        return v;
    }

    public static ArrayList<String> getAllSidNames() throws SQLException, ClassNotFoundException {
        String sql="select name from SeaGuard";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> sids=new ArrayList<>();
        while (rst.next()) {
            sids.add(rst.getString(1)); 
        }
        return sids;          
    }

    public static String searchName(String sid) throws SQLException, ClassNotFoundException {
        String sql="select name from seaguard where sid =?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, sid);
        ResultSet rst = stm.executeQuery();
        rst.next();
        return rst.getString(1);
    }

    public static ArrayList<String> getSelectedSids() throws SQLException, ClassNotFoundException {
        String sql="select sid from SeaGuard where docstatues=1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> sids=new ArrayList<>();
        while (rst.next()) {
            sids.add(rst.getString(1)); 
        }
        return sids;          
    }

    public static String getSeaGuardName(String sid) throws SQLException, ClassNotFoundException {
        String sql="select name from SeaGuard where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, sid);
        ResultSet rst = stm.executeQuery();
        rst.next();
        return rst.getString(1);
    }

    
    
    
}
