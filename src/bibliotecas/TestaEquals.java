package bibliotecas;

public class TestaEquals {
	
	public static void main(String[] args) {
		
		int i =0;
		int j =0;
		
		if(i==j) {
			System.out.println("i e j são iguais.");
		}
		else {
			System.out.println("i e j são diferentes.");
		}
		
		String c = new String("Senac 456");
		String d = new String("Senac 456");		
		
		
		/***********************************************************
		 * 
		 * Compara o OID (Object ID) dos objetos comparados.
		 * OID: Valor Hexadecimal, que corresponde a um hash da memória 
		 * 
		 ***********************************************************/
		if(c==d) {
			System.out.println("Os OIDs de c e d são iguais.");
		}
		else {
			System.out.println("Os OIDs de c e d são diferentes.");
		}
		
		if(c.equals(d)) {
			System.out.println("As Strings c e d possuem o mesmo conteúdo.");
		}
		else {
			System.out.println("As Strings c e d possuem conteúdos diferentes.");
		}
		
		
		
	}

}
