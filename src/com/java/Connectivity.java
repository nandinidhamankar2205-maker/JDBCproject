package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Connectivity {
public static void main(String[] args) throws Exception {
System.out.println("Github");
	Scanner sc = new Scanner(System.in);
	System.out.println(1);
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println(2);
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "@naina22");
	System.out.println("Connection successful");
	
	System.out.println("Enter id, name,age");
	int id = sc.nextInt();
	String name = sc.next();
	int age = sc.nextInt();
	
	String sql = "insert into student values(?,?,?);";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setInt(1, id);
	pstmt.setString(2, name);
	pstmt.setInt(3, age);
	pstmt.executeUpdate();
	System.out.println("record added");
}
}
