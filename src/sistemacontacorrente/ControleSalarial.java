package sistemacontacorrente;

public class ControleSalarial {
	private double totalSalarios = 0;
	
	//Polimorfismo
	//pode ter comportamentos diferentes
	//resolvido em tempo de execução
	public void setTotalSalarios(Funcionario2 funcionario) {
		this.totalSalarios += funcionario.getSalario();
	}
	
	public double getTotalSalarios() {
		return totalSalarios;
	}

}
