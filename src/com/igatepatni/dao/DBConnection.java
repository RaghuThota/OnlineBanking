package com.igatepatni.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnection{
	
	public static Connection getConnection() throws NamingException, SQLException{
		Connection connection=null;
		InitialContext iContext;

			iContext = new InitialContext();
			DataSource dataSource=(DataSource) iContext.lookup("OracleDS");
			connection=dataSource.getConnection();
			
		return connection;
		
	}
	
}