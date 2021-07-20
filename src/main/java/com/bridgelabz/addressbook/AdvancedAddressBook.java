package com.bridgelabz.addressbook;

import java.sql.*;

public class AdvancedAddressBook {

	public static void main(String[] args) throws Exception {
		// register driver
		String url = "jdbc:mysql://localhost:3306/AddressBookService";
		String userName = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Welcome to Address Book System!");
	}

}
