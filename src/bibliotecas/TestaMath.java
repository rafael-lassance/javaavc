package bibliotecas;

public class TestaMath {

	public static void main(String[] args) {
		 
		int i = -10;
		System.out.println(i);
		
		int j= Math.abs(i);
		System.out.println(j);
		
		double d1 = 4.15;
		System.out.println(d1);
		
		double d2 = Math.round(d1);
		System.out.println(d2);

		//Para casa: depois subir para o GitHub
		//Implementar classes de teste para os seguintes metodos de Math
		//usar e depois com o comentario explicar o que faz:
		//random(), max, min, ceil, floor, exp, log, pow,
		// sqrt, sin, toDegrees, toRadians
		
		/**************
		 * Random:
		 * retorna um double com sinal positivo,
		 * maior ou igual a 0 e menor do que 1.
		 **************/
		double d4 = Math.random(); 
		System.out.println("Random: " + d4);
		
		/****************
		 * Max:
		 * retorna o maior entre dois valores double
		 ****************/
		double d5 = Math.max(d1, d2);
		System.out.println("Max("+d1+","+d2+ "): " + d5);
		
		/****************
		 * Min:
		 * retorna o menor entre dois valores double
		 ****************/
		double d6 = Math.min(d1, d2);
		System.out.println("Min("+d1+","+d2+ "): " + d6);
		
		
		/****************
		 * Ceil:
		 * retorna o menor valor double que é maior ou igual ao argumento
		 * e que é igual a um inteiro matemático.
		 ****************/
		double d8 = Math.ceil(d1);
		System.out.println("Ceil("+d1+"): " + d8);
		
		/****************
		 * Floor:
		 * retorna o maior valor double que é menor ou igual ao argumento
		 * e que é igual a um inteiro matemático.
		 ****************/
		double d9 = Math.floor(d1);
		System.out.println("Floor("+d1+"): " + d9);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
