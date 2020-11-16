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
import model.Salary;
import model1.SalarySub;
import other.IDGenerator;

/**
 *
 * @author Dell
 */
public class SalaryController {

    public static String getNextSlId() throws SQLException, ClassNotFoundException {
        String sql="select salaryId from salary order by 1 desc limit 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return IDGenerator.getNextId("Sl", rst.getString(1));
        }
        return IDGenerator.getNextId("Sl", null);
    }

    public static boolean addSalary(Salary s) throws SQLException, ClassNotFoundException {
        String sql="insert into salary values(?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, s.getSid());
        stm.setObject(2, s.getRid());
        stm.setObject(3, s.getDate());
        stm.setObject(4, s.getAmount());
        
        return stm.executeUpdate()>0;
        
    }

    public static ArrayList<Salary> getSalariesForRid(String rid) throws SQLException, ClassNotFoundException {
        String sql="select * from salary where rid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, rid);
        ResultSet rst = stm.executeQuery();
        ArrayList<Salary> s=new ArrayList<>();
        while (rst.next()) {
            s.add(new Salary(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4)));
        }
        return s;
    }

    public static ArrayList<String> getSlIds() throws ClassNotFoundException, SQLException {
        String sql="select salaryId from salary order by 1";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<String> s1=new ArrayList<>();
        while (rst.next()) {
            s1.add(rst.getString(1));
        }
        return s1;
        
    }

    public static Salary getSalary(String slid) throws SQLException, ClassNotFoundException {
        String sql="select * from salary where salaryid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, slid);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Salary(rst.getString(1),rst.getString(2),rst.getString(3),rst.getDouble(4));
        }
        return null;
        
        
        
    }

    public static boolean updateSalary(Salary s) throws SQLException, ClassNotFoundException {
        String sql="update salary set rid=?,amount_rupees=? where salaryId=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, s.getRid());
        stm.setObject(2, s.getAmount());
        stm.setObject(3, s.getSid());
        return stm.executeUpdate()>0;
        
        
        
    }

    public static ArrayList<Salary> getAllSalaries() throws SQLException, ClassNotFoundException {
        String sql="select * from salary";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Salary> s=new ArrayList<>();
        while (rst.next()) {
            s.add(new Salary(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4)));
        }
        return s;
        
    }

    public static ArrayList<Salary> getSalariesofDate(String date) throws SQLException, ClassNotFoundException {
        String sql = "select * from salary where dateofPayment=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, date);
        ResultSet rst = stm.executeQuery();
        ArrayList<Salary> p = new ArrayList<>();
        while (rst.next()) {
            p.add(new Salary(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4)));
        }
        return p;
    }

    public static ArrayList<SalarySub> getSalariesForSid(String sid) throws SQLException, ClassNotFoundException {
        String sql="select r.sid,name,salaryid,s.rid,dateofpayment,amount_Rupees from salary s,reservation r,seaGuard sG  where s.rid=r.rid and r.sid=sG.sid ;";
        Connection connection=DBConnection.getDBConnection().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<SalarySub> s=new ArrayList<>();
        while (rst.next()) {
            if (rst.getString(1).equals(sid)) {
                s.add(new SalarySub(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6)));
            }
        }
        return s;
        
        
        
        
    }

    public static boolean deleteSalary(String slId) throws SQLException, ClassNotFoundException {
        String sql = "delete from salary where salaryId=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, slId);
        return  stm.executeUpdate()>0;
        
        
    }

    public static ArrayList<Salary> getSalariessOfMonth(String year, String month) throws SQLException, ClassNotFoundException {
        String sql="select * from salary where month(DateOfPayment)=? and year(DateOfPayment)=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, month);
        stm.setObject(2, year);
        ResultSet rst = stm.executeQuery();
        ArrayList<Salary> p=new ArrayList<>();
        while (rst.next()) {
            p.add(new Salary(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4)));
            
        }
        return p;
        
    }
    
    
}
