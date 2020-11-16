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
import model.Experiences;

/**
 *
 * @author Dell
 */
public class ExperienceController {

    public static boolean addExperience(Experiences experiences) throws SQLException, ClassNotFoundException {
        String sql="insert into Experience value(?,?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, experiences.getSid());
        stm.setObject(2, experiences.getService());
        stm.setObject(3, experiences.getRank());
        stm.setObject(4, experiences.getBranch());
        stm.setObject(5, experiences.getDuration());
        return stm.executeUpdate()>0;
        
    }

    public static Experiences getExperience(String sid) throws SQLException, ClassNotFoundException {
        String sql="select * from experience where sid=?";
        Connection connection=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, sid);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Experiences(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(5), rst.getString(4));
        }
        return  null;
        
    }
    
}
