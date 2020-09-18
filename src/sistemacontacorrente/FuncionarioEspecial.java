package sistemacontacorrente;

//Funcionario2 -> FuncionarioEspecial -> Gerente

public abstract class FuncionarioEspecial extends Funcionario2{
	
	abstract boolean verifica(String senha);
	
}
