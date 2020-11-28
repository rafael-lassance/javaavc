package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Scanner;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		
	/*	System.out.println("Insira a senha do banco de dados:");
		
		Scanner scan = new Scanner(System.in);
		
		String senha = scan.nextLine();
		
*/		
		//"jdbc:mysql://localhost:port/bd_name?useTimezone=true&serverTimezone=UTC"
		return DriverManager.getConnection("jdbc:mysql://localhost/teste2", "root", "root");
		
	}

}
