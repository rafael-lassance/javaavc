package bibliotecas;

public class TestaString {
	
	public static void main(String[] args) {
		
		String a ="Aprendendo muito Java";
	
		/*********************
		 * 
		 * Dividir uma String
		 *
		 *********************/
		String b[] = a.split(" ");
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		//System.out.println(b[3]);
		
		
		String c = "aprendendo muito java";
		
		/*********************
		 * 
		 * Comparar duas Strings
		 *
		 *********************/
		
		int i = a.compareTo(a);
		System.out.println(i);
		
		int j = a.compareTo(c);
		System.out.println(j);
		
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		
		/********************************
		 * 
		 * Passar String para Min�sculas
		 *
		 ********************************/
		
		String d = a.toLowerCase();
		System.out.println(d);
		
		
		/*******************************
		 * 
		 * Passar String para Mai�sculas
		 *
		 *******************************/
		
		String e = a.toUpperCase();
		System.out.println(e);
		
		
		/*************************************************
		 * 
		 * 	Com a vari�vel "a" e o aux�lio de outras vari�veis
		 *  crie exemplos para demonstrar a funcionalidade
		 *  dos seguintes m�todos de String (podem ou n�o ter params):
		 *  
		 *  charAt(); length(); substring(); indexOf(); lastIndexOf();
		 *  isEmpty(); contains(); replace().
		 * 
		 **************************************************/
	
		 
		
		

	}

}
