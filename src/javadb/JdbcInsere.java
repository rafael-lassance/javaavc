package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//Vamos evoluir para 4 camadas..

//Vamos agora a mais um refinamento, separando a camada de aplica��o da regra de neg�cio...

//Num padr�o MVC, seria separar o V (view, camada de aplica��o) do C (controller, regra de neg�cio)

//E o padr�o que vamos utilizar para separar aplica��o (view) da regra de neg�cio � o famoso DAO...

public class JdbcInsere {
	
	public static void main(String[] args) {
		
		try {
			Connection con = ConnectionFactory.getConnection();

			String sql = "INSERT INTO contatos (nome, email, endereco) VALUES (?, ?, ?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "Jo�o");
			stmt.setString(2, "joao@email.com");
			stmt.setString(3, "Rua tal, 123");
			
			stmt.execute();
			
			stmt.close();
			
			System.out.println("Grava��o realizada com sucesso.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	
}
