package excecoes;

public class TestException {
	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");
		metodo1();
		System.out.println("Fim do metodo main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		int array[];
		array = new int [10];
		//Lançamento de Excessão sem Tratamento
		//para ver mensagem que aparece no console
		//Array index out of bounds exception
		for (int i = 0; i < 20; i++) {
			array[i]=i;
			System.out.println(i);
		}
		System.out.println("Fim do metodo2");
		
	}
}
