package sistemacontacorrente;

public class Cliente implements AcessoInterno{
	String nome;
	String sobrenome;
	String cpf;
	
	
	@Override
	public boolean verifica(String senha) {
	
		return false;
	}
}