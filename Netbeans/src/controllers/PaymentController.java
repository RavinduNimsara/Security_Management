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
import java.sql.Statement;
import java.util.ArrayList;
import model.Payment;
import other.IDGenerator;

/**
 *
 * @author Dell
 */
public class PaymentController {

    public static String getNextPaymentId() throws SQLException, ClassNotFoundException {
        String sql = "select pid from payment order by 1 desc limit 1";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return IDGenerator.getNextId("P", rst.getString(1));
        }
        return IDGenerator.getNextId("P", null);
    }

    public static boolean addPayment(Payment p) throws SQLException, ClassNotFoundException {
        String sql = "insert into payment value(?,?,?,?,?,?)";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, p.getPid());
        stm.setObject(2, p.getRid());
        stm.setObject(3, p.getDate());
        stm.setObject(4, p.getAmountUS$());
        stm.setObject(5, p.getAmountRs());
        stm.setObject(6, p.getRate());
        return stm.executeUpdate() > 0;
    }

    public static ArrayList<Payment> getPayments(String rid) throws SQLException, ClassNotFoundException {
        String sql = "select * from payment where rid=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, rid);
        ResultSet rst = stm.executeQuery();
        ArrayList<Payment> p = new ArrayList<>();
        while (rst.next()) {
            p.add(new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6)));
        }
        return p;

    }

    public static ArrayList<Payment> getAllPayments() throws SQLException, ClassNotFoundException {
        String sql = "select * from payment";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Payment> p = new ArrayList<>();
        while (rst.next()) {
            p.add(new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6)));
        }
        return p;
    }

    public static ArrayList<Payment> getPaymentsofDate(String date) throws SQLException, ClassNotFoundException {
        String sql = "select * from payment where dateofPayment=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, date);
        ResultSet rst = stm.executeQuery();
        ArrayList<Payment> p = new ArrayList<>();
        while (rst.next()) {
            p.add(new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6)));
        }
        return p;
    }

    public static ArrayList<Payment> getPaymentsOfShId(String shId) throws SQLException, ClassNotFoundException {
        String sql = "select pid ,p.rid,dateofpayment,amount_US$,amount_Rupees,rate,shId from payment p , reservation r,ships s where p.rid=r.rid and r.shipId=s.shipId order by 1;";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Payment> p = new ArrayList<>();
        while (rst.next()) {
            if (rst.getString(7).equals(shId)) {
                p.add(new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6)));

            }
        }
        return p;
    }

    public static ArrayList<Payment> getPaymentsOfShipId(String shipId) throws SQLException, ClassNotFoundException {
        String sql = "select pid ,p.rid,dateofpayment,amount_US$,amount_Rupees,rate,shipId from payment p , reservation r where p.rid=r.rid order by pid";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Payment> p = new ArrayList<>();
        while (rst.next()) {
            if (rst.getString(7).equals(shipId)) {
                p.add(new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6)));

            }
        }
        return p;
    }

    public static Payment getPayment(String pid) throws SQLException, ClassNotFoundException {
        String sql = "select * from payment where pid=? ";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, pid);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6));
        }
        return null;
    }

    public static boolean updatePayment(Payment p) throws SQLException, ClassNotFoundException {
        String sql = "update payment set rid=?,Amount_US$=?,Amount_Rupees=?,Rate=? where pid =?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, p.getRid());
        stm.setObject(2, p.getAmountUS$());
        stm.setObject(3, p.getAmountRs());
        stm.setObject(4, p.getRate());
        stm.setObject(5, p.getPid());

        return stm.executeUpdate() > 0;

    }

    public static boolean deletePayment(String pid) throws SQLException, ClassNotFoundException {
        String sql = "delete from payment where pid=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, pid);
        return stm.executeUpdate()>0;
        

    }

    public static ArrayList<Payment> getPaymentsOfMonth(String year, String month) throws SQLException, ClassNotFoundException {
        String sql="select * from payment where month(DateOfPayment)=? and year(DateOfPayment)=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, month);
        stm.setObject(2, year);
        ResultSet rst = stm.executeQuery();
        ArrayList<Payment> p=new ArrayList<>();
        while (rst.next()) {
            p.add(new Payment(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getDouble(5), rst.getDouble(6)));
            
        }
        return p;
        
    }

}
