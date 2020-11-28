package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//Vamos evoluir para 4 camadas..

//Vamos agora a mais um refinamento, separando a camada de aplicação da regra de negócio...

//Num padrão MVC, seria separar o V (view, camada de aplicação) do C (controller, regra de negócio)

//E o padrão que vamos utilizar para separar aplicação (view) da regra de negócio é o famoso DAO...

public class JdbcInsere {
	
	public static void main(String[] args) {
		
		try {
			Connection con = ConnectionFactory.getConnection();

			String sql = "INSERT INTO contatos (nome, email, endereco) VALUES (?, ?, ?)";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, "João");
			stmt.setString(2, "joao@email.com");
			stmt.setString(3, "Rua tal, 123");
			
			stmt.execute();
			
			stmt.close();
			
			System.out.println("Gravação realizada com sucesso.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	
}
