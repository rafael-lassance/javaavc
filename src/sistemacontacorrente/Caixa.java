package sistemacontacorrente;

public class Caixa extends FuncionarioEspecial{
	int senha;

	@Override
	double getBonus() {
		
		return 0;
	}
	
//	boolean verifica() {
//		return false;
//	}

	@Override
	boolean verifica(String senha) {
	
		return false;
	}

}
