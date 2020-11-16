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
import model.Reservation;
import model.SeaGuard;
import model1.ReservationMT;
import model1.ReservationsOfSeaGuard;
import other.IDGenerator;

/**
 *
 * @author Dell
 */
public class ReservationController {

    public static boolean addReservation(Reservation s) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "Insert into reservation values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setObject(1, s.getRid());
        pstm.setObject(2, s.getSid());
        pstm.setObject(4, s.getDate());
        pstm.setObject(3, s.getShipId());
        pstm.setObject(5, s.getSignInDate());
        pstm.setObject(6, s.getSignOutDate());
        pstm.setObject(7, s.getSignInPort());
        pstm.setObject(8, s.getSignOutPort());
        pstm.setObject(9, s.getAgreedSalary());
        return pstm.executeUpdate() > 0;
    }

    public static String getNextRid() throws SQLException, ClassNotFoundException {
        String sql = "select rid from reservation order by 1 desc limit 1";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return IDGenerator.getNextId("R", rst.getString(1));
        }
        return IDGenerator.getNextId("R", null);
    }

    public static ArrayList<ReservationMT> getReservationsT() throws SQLException, ClassNotFoundException {
        String sql = "select rid,sid,shipId,dateoR from reservation";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<ReservationMT> r1 = new ArrayList<>();
        while (rst.next()) {
            r1.add(new ReservationMT(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)));
        }
        return r1;
    }

    public static Reservation getReservation(String rid) throws SQLException, ClassNotFoundException {
        String sql = "select * from reservation where rid=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, rid);
        ResultSet rst = stm.executeQuery();
        rst.next();
        return new Reservation(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getDouble(9));
    }

    public static boolean updateReservation(Reservation s) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getDBConnection().getConnection();
        String sql = "Update reservation set sid=?, shipId=?, Sign_in_date=?,Sign_out_date=?,Sign_in_port=?,Sign_out_port=?,agreedSalary=? where rid=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setObject(8, s.getRid());
        pstm.setObject(1, s.getSid());
        pstm.setObject(2, s.getShipId());
        pstm.setObject(3, s.getSignInDate());
        pstm.setObject(4, s.getSignOutDate());
        pstm.setObject(5, s.getSignInPort());
        pstm.setObject(6, s.getSignOutPort());
        pstm.setObject(7, s.getAgreedSalary());
        return pstm.executeUpdate() > 0;
    }

    public static boolean deleteReservation(String rid) throws SQLException, ClassNotFoundException {
        String sql = "delete from reservation where rid =?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, rid);
        return stm.executeUpdate() > 0;
    }

    public static ArrayList<String> getRids() throws SQLException, ClassNotFoundException {
        String sql = "select rid from reservation";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> s = new ArrayList<>();
        while (rst.next()) {
            s.add(rst.getString(1));
        }
        return s;

    }

    public static ArrayList<ReservationsOfSeaGuard> getSeaGuardsReservations(String sid) throws SQLException, ClassNotFoundException {
        String sql = "select sid,rid,shipId,Sign_in_date,Sign_out_date from reservation where sid=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, sid);
        ResultSet rst = stm.executeQuery();
        ArrayList<ReservationsOfSeaGuard> r = new ArrayList<>();
        while (rst.next()) {
            r.add(new ReservationsOfSeaGuard(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
        }
        return r;

    }

}
