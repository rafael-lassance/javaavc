package sistemacontacorrente;

//Heranca funcionaria
//mas seria um erro em relacao
//a regra de negocio
//Não seria melhor uma composicao?
//public class Conta3 extends Cliente{ //com heranca
public class Conta4 {
	
	private static int contador;
	
	int numero;
	//primeira solucao um pouco melhor
	//Cliente cliente = new Cliente();
	//segunda solucao: melhor ainda
	Cliente cliente;
	//String nome;
	double saldo;
	double limite;
	
//	Conta3(){
//		
//	}
	
	Conta4(String nome, String cpf){
		cliente = new Cliente();
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		Conta4.contador++;
	}
	
	public static int getContadorContas() {
		return Conta4.contador;
	}
	
	boolean sacar(double valor) {
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		//OUTRO OPCAO1
		//saldo = saldo - valor;
		//OUTRO OPCAO2
		//saldo -= valor;
		//OUTRO OPCAO3
		//this.saldo -= valor;
		if (valor <= this.saldo+this.limite) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
}