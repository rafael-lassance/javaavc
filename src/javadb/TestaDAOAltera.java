package javadb;

import java.sql.SQLException;

public class TestaDAOAltera {
	
	public static void main(String[] args) {
		
		try {
			
			ContatoDAO dao = new ContatoDAO();
			
			Long id = 1l;
			
			Contato contato = new Contato();
			contato.setNome("Maria");
			contato.setEmail("maria@email.com");
			contato.setEndereco("Rua de tal 1234");
			
			dao.altera(id, contato);
			
			System.out.println("Registro alterado com sucesso.");
			
			dao.fechaConexao();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	}
	
}
