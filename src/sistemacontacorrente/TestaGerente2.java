package sistemacontacorrente;

public class TestaGerente2 {
	public static void main(String[] args) {
		
		Funcionario2 f2 = new Gerente2();
		f2.setSalario(1000);
		double salFunc = f2.getSalario();
		System.out.println("Salario funcionario: " + salFunc);
		
		double bonusFunc = f2.getBonus();
		System.out.println("Bonus funcionario: " + bonusFunc);
		
		Gerente2 g2 = new Gerente2();
		
		g2.setSalario(2000);
		double salGer = g2.getSalario();
		System.out.println("Salario gerente: " + salGer);
		
		double bonusGer = g2.getBonus();
		System.out.println("Bonus gerente: " + bonusGer);
		
		
		
		
		
	}
}