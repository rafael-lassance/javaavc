package bibliotecas;

public class TestaMath2 {

	public static void main(String[] args) {
		  

		//Para casa: depois subir para o GitHub
		//Implementar classes de teste para os seguintes metodos de Math
		//usar e depois com o comentario explicar o que faz:
		//random(), max, min, ceil, floor, exp, log, pow,
		// sqrt, sin, toDegrees, toRadians
		
		
		
		/****************
		 * Exp:
		 * retorna o numero de Euler 'e' elevado a um valor double.
		 ****************/
		double d1 = 1.0;
		double dExp = Math.exp(d1);
		System.out.println("Exp("+d1+"): " + dExp);
		
		/****************
		 * Log:
		 * retorna o logaritmo natural (base 'e') de um valor double.
		 ****************/
		double dLog = Math.log(d1);
		System.out.println("Log("+d1+"): " + dLog);
		
		/****************
		 * Pow:
		 * retorna o valor do primeiro argumento elevado ao segundo argumento.
		 ****************/
		double d2 = 2.0;
		double d3 = 3.0;
		double dPow = Math.pow(d2,d3);
		System.out.println("Pow("+d2+","+d3+"): " + dPow);
		
		/****************
		 * Sqrt:
		 * retorna o arrendodamento correto da raiz quadrada positiva de um valor double.
		 ****************/
		double dSqrt = Math.sqrt(d2);
		System.out.println("Sqrt("+d2+"): " + dSqrt);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
