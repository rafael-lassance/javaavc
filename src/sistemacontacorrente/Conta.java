package sistemacontacorrente;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	
	public boolean sacar(double valor) {
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
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
}