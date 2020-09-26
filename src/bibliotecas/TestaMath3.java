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
		 * valor double que � mais pr�ximo de Pi
		 * o raio entre o per�metro de uma circunfer�ncia e seu di�metro. 
		 */
		double dPi = Math.PI;
		System.out.println("Pi: " + dPi);
		
		
		/****************
		 * Sin:
		 * retorna o seno trigonom�trico de um �ngulo em radianos.
		 ****************/
		double d14 = Math.sin(dPi);
		System.out.println("Sin("+dPi+"): " + d14);
		
		/****************
		 * ToDegrees:
		 * Converte um �ngulo medido em radianos a um �ngulo
		 * equivalente aproximado medido em graus.
		 ****************/
		double d15 = Math.toDegrees(dPi);
		System.out.println("ToDegrees("+dPi+"): " + d15);
		
		
		/****************
		 * ToRadians:
		 * Converte um �ngulo medido em graus a um �ngulo
		 * equivalente aproximado medido em radianos.
		 ****************/
		double d16 = Math.toRadians(d15);
		System.out.println("ToRadians("+d15+"): " + d16);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
