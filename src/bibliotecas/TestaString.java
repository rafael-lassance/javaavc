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
		 * Passar String para Minúsculas
		 *
		 ********************************/
		
		String d = a.toLowerCase();
		System.out.println(d);
		
		
		/*******************************
		 * 
		 * Passar String para Maiúsculas
		 *
		 *******************************/
		
		String e = a.toUpperCase();
		System.out.println(e);
		
		
		/*************************************************
		 * 
		 * 	Com a variável "a" e o auxílio de outras variáveis
		 *  crie exemplos para demonstrar a funcionalidade
		 *  dos seguintes métodos de String (podem ou não ter params):
		 *  
		 *  charAt(); length(); substring(); indexOf(); lastIndexOf();
		 *  isEmpty(); contains(); replace().
		 * 
		 **************************************************/
	
		 
		/*********************
		 * 
		 * charAt:
		 * retorna o valor char no índice especificado.
		 * 
		 *********************/
		char f = a.charAt(0);
		System.out.println("Valor char no indice 0: " + f);
		
		
		
		/*********************
		 * 
		 * length:
		 * retorna o tamanho desta String.
		 * 
		 *********************/
		int g = a.length();
		System.out.println("Tamanho da String: " + g);
		
		
		/*********************
		 * 
		 * substring:
		 * retorna uma String que é uma substring desta String.
		 * 
		 *********************/
		String h = a.substring(5);
		System.out.println("Substring a partir do indice 5: " + h);
		
		String m = a.substring(5,10);
		System.out.println("Substring a partir do indice 5 ate o indice 10: " + m);
		
		
		
		/*********************
		 * 
		 * indexOf:
		 * retorna o índice dentro da String da primeira ocorrência do char especificado.
		 * 
		 *********************/
		int n = a.indexOf("a");
		System.out.println("Indice do char 'a': " + n);
		
		
		/*********************
		 * 
		 * lastIndexOf:
		 * retorna o índice dentro da String da última ocorrência do char especificado.
		 * 
		 *********************/
		int o = a.lastIndexOf("a");
		System.out.println("Ultimo indice do char 'a': " + o);
		
		
		/*********************
		 * 
		 * isEmpty:
		 * retorna true se, e somente se, o tamanho da String é 0.
		 * 
		 *********************/
		boolean p = a.isEmpty();
		System.out.println("String vazia?: " + p);
		
		/*********************
		 * 
		 * contains:
		 * retorna true se, e somente se, esta String contém a sequência especificada de valores char.
		 * 
		 *********************/
		boolean r = a.contains("Java");
		System.out.println("String contém a sequência de char 'Java' ? : " + r);
		
		
		/*********************
		 * 
		 * replace:
		 * retorna uma String resultante da substituição de todas as ocorrências do charAntigo pelo charNovo.
		 * 
		 *********************/
		String s = a.replace('a', 'e');
		System.out.println("Substituir o char 'a' por 'e': " + s);
		
		/*********************
		 * 
		 * replace:
		 * Substitui cada substring desta String igual à sequência alvo pela sequência de substituição.
		 * 
		 *********************/
		String t = a.replace("Java", "C++");
		System.out.println("Substituir a sequência 'Java' por 'C++' : " + t);
		
		
		

	}

}
