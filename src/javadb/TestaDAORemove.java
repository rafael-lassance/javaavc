package javadb;

import java.sql.SQLException;

public class TestaDAORemove {

public static void main(String[] args) {
		
		try {
			
			ContatoDAO dao = new ContatoDAO();
			
			Long id = 1l;
			
						
			dao.remove(id);
			
			System.out.println("Registro removido com sucesso.");
			
			dao.fechaConexao();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	}
}
