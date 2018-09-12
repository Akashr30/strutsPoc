package com.poc.aml.bo;

import java.sql.Connection;
import java.sql.DriverManager;

public interface ConnectionManager {

		public Connection connection;
	    public String url;
	    public String username;
	    public String password;

	    url ="jdbc:sqlserver://192.168.40.105\\SQLEXPRESS:1433;databaseName=AML_Training";
	    username = "sa";
	    password="Sql123$";

     try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         this.connection =  DriverManager.getConnection(url, username, password);
        }
     catch (ClassNotFoundException ex) {
         System.out.println("Database Connection Creation Failed : " + ex.getMessage());
     }

}

