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
import java.util.ArrayList;
import model.Ship;
import model.ShipOwner;
import other.IDGenerator;

/**
 *
 * @author Dell
 */
public class ShipController {

    public static String getNextShipOwnerId() throws SQLException, ClassNotFoundException {
        String sql="select shid from ship_owners order by 1 desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return IDGenerator.getNextId("Sh", rst.getString(1));
        }
        return IDGenerator.getNextId("Sh", null);
    }

    public static String getNextShipId() throws SQLException, ClassNotFoundException {
        String sql="select shipid from ships order by 1 desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return IDGenerator.getNextId("Ship", rst.getString(1));
        }
        return IDGenerator.getNextId("Ship", null);
    }

    public static boolean addShipOwner(ShipOwner s1, ArrayList<Ship> s2) throws SQLException, ClassNotFoundException {
        String sql="insert into ship_owners value(?,?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        PreparedStatement stm=connection.prepareStatement(sql);
        try{
            stm.setObject(1, s1.getShipOwnerId());
            stm.setObject(2, s1.getName());
            stm.setObject(3, s1.getCountry());
            stm.setObject(4, s1.getTelephone());
            stm.setObject(5, s1.getEmail());
            boolean res=stm.executeUpdate()>0;
            if (res) {
                boolean res1=addShip(s2);
                if (res1) {
                    connection.commit();
                    return true;
                }
                connection.rollback();
                return  false;
            }
            connection.rollback();
            return false;
        }finally{
            connection.setAutoCommit(true);
        }

        
        
        
        
        
    }

    public static boolean addShip(ArrayList<Ship> s2) throws SQLException, ClassNotFoundException {
        String sql="insert into ships values(?,?,?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        int c=0;
        for (Ship ship : s2) {
            stm.setObject(1, ship.getShipId());
            stm.setObject(2, ship.getShipOwnerId());
            stm.setObject(3, ship.getShipName());
            stm.setObject(4, ship.getCargoType());
            stm.setObject(5, ship.getTele());
            stm.setObject(6, ship.getEmail());
            c+=stm.executeUpdate();
        }
        return c==s2.size();
        
        
    }

    public static ArrayList<ShipOwner> getShipOwners() throws SQLException, ClassNotFoundException {
        String sql="select * from ship_owners";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ShipOwner> s1=new ArrayList<>();
        while (rst.next()) {
            s1.add(new ShipOwner(rst.getString(1),rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
        }
        return s1;
    }

    public static ArrayList<Ship> getShips(String shId) throws SQLException, ClassNotFoundException {
        String sql="select * from ships where shid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, shId);
        ResultSet rst = stm.executeQuery();
        ArrayList<Ship> s=new ArrayList<>();
        while (rst.next()) {
            s.add(new Ship(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        return s;
    }

    

    public static boolean deleteShipOwner(String shId) throws SQLException, ClassNotFoundException {
        String sql="delete from ship_owners where shid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, shId);
        return stm.executeUpdate()>0;
    }

    

    public static boolean deleteShip(String shipId) throws SQLException, ClassNotFoundException {
        String sql="delete from ships where shipId=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, shipId);
        return stm.executeUpdate()>0;
    }

    public static String searchShipOwner(String shId) throws SQLException, ClassNotFoundException {
        String sql="select name from ship_owners where shid =?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, shId);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
            
        }
        return null;
    }

    public static ArrayList<String> getShIds() throws SQLException, ClassNotFoundException {
        String sql="select shId from ship_owners";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> s1=new ArrayList<>();
        while (rst.next()) {
            s1.add(rst.getString(1));
        }
        return s1;
    }

    public static String searchShip(String shipId) throws SQLException, ClassNotFoundException {
        String sql="select name from ships where shipid =?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, shipId);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    public static String getShId(String shipId) throws SQLException, ClassNotFoundException {
        String sql="select shId from ships where shipId=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, shipId);
        ResultSet rst = stm.executeQuery();
        rst.next();
        return rst.getString(1);
    }

    public static boolean updateShipOwner(ArrayList<ShipOwner> s1) throws SQLException, ClassNotFoundException {
        String sql="update ship_owners set name=?,country=? ,telephone=?,email=? where shId=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        int c=0;
        for (ShipOwner s : s1) {
            stm.setObject(1, s.getName());
            stm.setObject(2, s.getCountry());
            stm.setObject(3, s.getTelephone());
            stm.setObject(4, s.getEmail());
            stm.setObject(5, s.getShipOwnerId());
            c += stm.executeUpdate();
        }
        return c==s1.size();
    }

    public static boolean updateShip(ArrayList<Ship> s1) throws SQLException, ClassNotFoundException {
        String sql="update ships set name=?,cargo_type=?, telephone=?,email=? where shipId=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        int c=0;
        for (Ship s : s1) {
            stm.setObject(1, s.getShipName());
            stm.setObject(2, s.getCargoType());
            stm.setObject(3, s.getTele());
            stm.setObject(4, s.getEmail());
            stm.setObject(5, s.getShipId());
            c += stm.executeUpdate();
        }
        return c==s1.size();
    }

   

   

    
   
    
}
