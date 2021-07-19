package com.bridgelabz;

import java.sql.*;

public class AdvancedAddressBook {

	public static void main(String[] args) throws Exception {
		// register driver
		String url = "jdbc:mysql://localhost:3306/AddressBookService";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create table
		String sql = "create table AddressBook(FirstName varchar(255),LastName varchar(255),Address varchar(255),city varchar(255),zip int,PhoneNumber varchar(10) primary key,Email varchar(255))";

		// establish connection
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		// ResultSet rs = st.executeQuery("select * student");

		// execute the query
		st.executeUpdate(sql);
		System.out.println("table created successfully....");

		st.close();
		con.close();
	}

}
