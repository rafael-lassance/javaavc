package javadb;

import java.sql.SQLException;
import java.util.List;

// 1. Inserir com classe Scanner
// 2. Método alterar no ContatoDao
// 3. Método remover no Contato Dao
// 4. Criar classes para testar o que foi implementado


public class TestaDAOLista {

	public static void main(String[] args) {

		try {
			ContatoDAO cDao = new ContatoDAO();
			
			List <Contato> contatos = cDao.getLista();

			for (Contato contato : contatos) {
				System.out.println("Id: " +contato.getId());
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Endereco: " + contato.getEndereco());
				System.out.println("-----------------");
			}
			
			cDao.fechaConexao();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
}
