package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Infosys {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
		Statement statement = connection.createStatement();
		statement.execute("Insert into infosysemp values(101,'Moni',22,'Female',8197539,'Developer',500000)");
		statement.execute("Insert into infosysemp values(102,'Akshi',18,'Female',97856539,'CA',700000)");
		statement.execute("Insert into infosysemp values(103,'Madhu',19,'Female',9878923,'Teacher',400000)");
		statement.execute("Insert into infosysemp values(104,'Aishu',20,'Female',6489270,'HR',300000)");
		statement.execute("Insert into infosysemp values(105,'Suju',26,'Male',8496780,'Developer',800000)");
		statement.execute("Insert into infosysemp values(106,'Anju',21,'Male',9273849,'Manager',900000)");
		statement.execute("Insert into infosysemp values(107,'Sheshu',15,'Male',8465890,'Data Science',300000)");
		statement.execute("Insert into infosysemp values(108,'Yash',28,'Male',7987654,'Accountant',500000)");
		statement.execute("Insert into infosysemp values(109,'Dad',50,'Male',9387598,'Professor',700000)");
		statement.execute("Insert into infosysemp values(110,'Mom',40,'Female',7467498,'Manager',600000)");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
