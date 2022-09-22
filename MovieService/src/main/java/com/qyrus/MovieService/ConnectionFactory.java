package com.qyrus.MovieService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        String url = "database-1.c711aynrggfz.ap-south-1.rds.amazonaws.com";
        String user = "admin";
        String password = "rootroot";
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection    conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
}
	