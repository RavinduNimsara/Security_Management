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
import model.Documents;

/**
 *
 * @author Dell
 */
public class DocumentController {

    public static boolean addDocument(Documents doc) throws SQLException, ClassNotFoundException {
        String sql="insert into document value(?,?,?,?,?,?,?,?,?,?,?)";
        String sql1="update seaguard set docstatues=? where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        PreparedStatement stm1=connection.prepareStatement(sql1);
        stm.setObject(1, doc.getSid());
        stm.setObject(2, doc.isPoliceReport());
        stm.setObject(3, doc.isMedicalReport());
        stm.setObject(4, doc.getNicNo());
        stm.setObject(5, doc.getNicNo());
        stm.setObject(6, doc.isNoObjectionLetter());
        stm.setObject(7, doc.getPassportNo());
        stm.setObject(8, doc.getBankPassbookNo());
        stm.setObject(9, doc.getYellowFeverCardNo());
        stm.setObject(10, doc.getCdcNo());
        stm.setObject(11, doc.isStatues());
        stm1.setObject(1, doc.isStatues());
        stm1.setObject(2, doc.getSid());
        return stm.executeUpdate()+stm1.executeUpdate()>1;
        
    }

    public static Documents searchDoc(String sid) throws SQLException, ClassNotFoundException {
        String sql="select * from document where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, sid);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Documents(rst.getString(1),rst.getBoolean(2),rst.getBoolean(3),rst.getString(4),rst.getString(5),rst.getBoolean(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getBoolean(11));
        }
        return null;
    }
    

    public static boolean updateDocument(Documents doc) throws SQLException, ClassNotFoundException {
        String sql="update document set policeReport=?,MedicalReport=?,NICNo=?,NICNoNOK=?,NoObjectionLetter=?,PassportNo=?,BankPassbookNo=?,YellowFeverCardNo=?,CDCNo=?,statues=? where sid=?";
        String sql1="update seaguard set docstatues=? where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        PreparedStatement stm1=connection.prepareStatement(sql1);
        stm.setObject(11, doc.getSid());
        stm.setObject(1, doc.isPoliceReport());
        stm.setObject(2, doc.isMedicalReport());
        stm.setObject(3, doc.getNicNo());
        stm.setObject(4, doc.getNicNo());
        stm.setObject(5, doc.isNoObjectionLetter());
        stm.setObject(6, doc.getPassportNo());
        stm.setObject(7, doc.getBankPassbookNo());
        stm.setObject(8, doc.getYellowFeverCardNo());
        stm.setObject(9, doc.getCdcNo());
        stm.setObject(10, doc.isStatues());
        stm1.setObject(1, doc.isStatues());
        stm1.setObject(2, doc.getSid());
        
        return stm.executeUpdate()+stm1.executeUpdate()>1;
    }
    
    
    
}
