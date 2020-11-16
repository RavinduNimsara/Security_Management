/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class DBConnection {
    private Connection conn;
	
    private static DBConnection ob;
	
    private DBConnection()throws SQLException, ClassNotFoundException{
	Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost/Monaro","root","ijse");
    }
	
    public static DBConnection getDBConnection()throws SQLException, ClassNotFoundException{
	if(ob==null){
            ob=new DBConnection();
	}
            return ob;
	}
	
    public Connection getConnection(){
	return conn;
    }
    
}
