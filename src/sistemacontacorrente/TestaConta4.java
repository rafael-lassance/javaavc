package sistemacontacorrente;

public class TestaConta4 {
	public static void main(String[] args) {
		
		Conta4 c1 = new Conta4("nome1","cpf1");
		System.out.println("Nome: "+c1.cliente.nome);
		System.out.println("Cpf: "+c1.cliente.cpf);
		
		int contador =  Conta4.getContadorContas();
		System.out.println("Contador: "+contador);
		
		Conta4 c2 = new Conta4("nome2","cpf2");
		System.out.println("\nNome: "+c2.cliente.nome);
		System.out.println("Cpf: "+c2.cliente.cpf);
		
		contador =  Conta4.getContadorContas();
		System.out.println("Contador: "+contador);
		
		
		
			
	}
}