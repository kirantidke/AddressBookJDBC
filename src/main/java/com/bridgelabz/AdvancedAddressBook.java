package com.bridgelabz;

import java.sql.*;

public class AdvancedAddressBook {

	public static void main(String[] args) throws Exception {
		// register driver
		String url = "jdbc:mysql://localhost:3306/AddressBookServices";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create table
		//String sql = "create table AddressBook(FirstName varchar(255),LastName varchar(255),Address varchar(255),city varchar(255),zip int,PhoneNumber varchar(10) primary key,Email varchar(255))";

		// establish connection
		try(Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
				){
					// ResultSet rs = st.executeQuery("select * student");

					// execute the query
					//st.executeUpdate(sql);
					//System.out.println("table created successfully....");

			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO AddressBook VALUES ('ajay','jagtap','pune','pune',126,'9598989898','a@gmail.com')";
			st.executeUpdate(sql);

			sql = "INSERT INTO AddressBook VALUES ('pooja','roy','mumbai','mumbai',323,'9898989800','p@gmail.com')";
			st.executeUpdate(sql);
			sql = "INSERT INTO AddressBook VALUES ('raj','patil','delhi','delhi',464,'9078989898','r@gmail.com')";
			st.executeUpdate(sql);
			sql = "INSERT INTO AddressBook VALUES ('kishor','karad','banglore','banglore',133,'9098989898','ks@gmail.com')";
			st.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		//st.close();
		//con.close();
	}

}
