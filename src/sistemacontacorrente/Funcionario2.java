package sistemacontacorrente;

public abstract class Funcionario2 {
	//protected String nome;
	protected String nome;
	protected String cpf;
	protected String departamento;
	protected String dataAdmissao;
	protected double salario;
	protected String status;
	
	//bonificacao percentual
//	double getBonus() {
//		return this.salario*0.05 ;
//	}

	
	
	//toda classe com método abstrato tem que ser abstrata
		//mas, nem toda classe abstrata, tem métodos abstratos
		abstract double getBonus();
		
		//a consequencia de uma classe ser abstrata eh que
		//ela não pode ser instanciada -> vide TestaGerente2
		//mas pode ser referenciada -> Vide ControleBonus
		//a consequencia de um metodo ser abstrato eh que
		//todos que herdarem da classe abstrata são obrigados
		//a implementar o metodo abstrato (mas eh sempre??)
		
		//exemplo:
		//classe C1 abstrata com metodo m1 abstrato
		//classe C2 abstrata que herda C1->não precisa implementar m1
		//classe C3 concreta que herda C2->obrigada a implementar m1
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}