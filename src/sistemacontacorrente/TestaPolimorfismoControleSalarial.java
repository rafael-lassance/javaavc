package sistemacontacorrente;

public class TestaPolimorfismoControleSalarial {
	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario2 f2 = new Gerente2();
		f2.setSalario(1000);
		controle.setTotalSalarios(f2);
		System.out.println(controle.getTotalSalarios());
		
		//Funcionario2 g2 = new Gerente2();
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
		controle.setTotalSalarios(g2);
		
		System.out.println(controle.getTotalSalarios());
	}
	

}
