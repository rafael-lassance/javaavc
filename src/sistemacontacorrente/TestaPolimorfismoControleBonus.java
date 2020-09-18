package sistemacontacorrente;

public class TestaPolimorfismoControleBonus {

	public static void main(String[] args) {
		
		ControleBonus controle = new ControleBonus();
		
		Funcionario2 f2 = new Gerente2();
		f2.setSalario(1000);
		controle.setTotalBonus(f2);
		System.out.println(controle.getTotalBonus());
		
		Funcionario2 g2 = new Gerente2();
		g2.setSalario(10000);
		controle.setTotalBonus(g2);
		System.out.println(controle.getTotalBonus());
		
	}
	
}
