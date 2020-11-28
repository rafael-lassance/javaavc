package javadb;

import java.sql.SQLException;
import java.util.Scanner;

public class TestaDAOInsere {

	public static void main(String[] args) {
		
		try {
			
			ContatoDAO dao = new ContatoDAO();
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Deseja inserir um novo contato? Digite s para sim ou n para n�o.");
			String resposta = scan.nextLine();
			
			while(resposta.equalsIgnoreCase("s")) {
			
				System.out.println("Digite o nome do contato:");
				String nome = scan.nextLine();
				
				System.out.println("Digite o email do contato:");
				String email = scan.nextLine();
				
				System.out.println("Digite o endere�o do contato:");
				String endereco = scan.nextLine();
				
				Contato contato = new Contato();
				contato.setNome(nome);
				contato.setEmail(email);
				contato.setEndereco(endereco);
				
				dao.adiciona(contato);
				
				System.out.println("Grava��o realizada com sucesso.");
				
				
				System.out.println("Deseja inserir um novo contato? Digite s para sim ou n para n�o.");
				resposta = scan.nextLine();
				
			}
		
			scan.close();
			
			dao.fechaConexao();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
