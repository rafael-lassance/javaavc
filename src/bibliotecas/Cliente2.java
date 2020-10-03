package bibliotecas;

public class Cliente2 {
	
	String nome;
	String endereco;
	
	
	public Cliente2 (String nome) {
		this.nome = nome;
	}
	
	/***************************************************
	 * 
	 * Sobreescrevendo o método toString da classe Object 
	 *
	 ****************************************************/
	public String toString () {
		return "Nome do cliente: " + this.nome;
	}

	
	
}
