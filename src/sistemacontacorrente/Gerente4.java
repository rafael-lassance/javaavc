package sistemacontacorrente;

//public class Gerente2 extends Funcionario2{
public class Gerente4 extends Funcionario2 implements AcessoInterno, AcessoInterno2{
	
	int senha;
	
	//bonificacao percentual maior do que funcionario
	double getBonus() {
		//utilizar o "super" para chamar metodo da classe pai
		return super.getSalario()*0.05 + 5000 ;
	}
	
//	public boolean verifica (int senha) {
//		if(this.senha == senha) {
//			System.out.println("Acesso autorizado.");
//			return true;
//		}
//		else {
//			System.out.println("Acesso não autorizado.");
//			return false;
//		}
//	}

	@Override
	public
	boolean verifica(String senha) {
	
		return false;
	}

@Override
public boolean verifica2(String senha) {

	return false;
}
	
	
}
