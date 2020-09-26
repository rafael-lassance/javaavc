package bibliotecas;

public class TestaMath3 {

	public static void main(String[] args) {
		

		//Para casa: depois subir para o GitHub
		//Implementar classes de teste para os seguintes metodos de Math
		//usar e depois com o comentario explicar o que faz:
		//random(), max, min, ceil, floor, exp, log, pow,
		// sqrt, sin, toDegrees, toRadians
		
		 
		/*******************
		 * PI (Campo)
		 * valor double que é mais próximo de Pi
		 * o raio entre o perímetro de uma circunferência e seu diâmetro. 
		 */
		double dPi = Math.PI;
		System.out.println("Pi: " + dPi);
		
		
		/****************
		 * Sin:
		 * retorna o seno trigonométrico de um ângulo em radianos.
		 ****************/
		double d14 = Math.sin(dPi);
		System.out.println("Sin("+dPi+"): " + d14);
		
		/****************
		 * ToDegrees:
		 * Converte um ângulo medido em radianos a um ângulo
		 * equivalente aproximado medido em graus.
		 ****************/
		double d15 = Math.toDegrees(dPi);
		System.out.println("ToDegrees("+dPi+"): " + d15);
		
		
		/****************
		 * ToRadians:
		 * Converte um ângulo medido em graus a um ângulo
		 * equivalente aproximado medido em radianos.
		 ****************/
		double d16 = Math.toRadians(d15);
		System.out.println("ToRadians("+d15+"): " + d16);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
