package bibliotecas;

public class TestaIntToString {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		
		/**********************************************************
		 * Atribui��o direta entre tipos diferentes n�o � permitida
		 **********************************************************/
		//String s = i;
		
		/*******************************************
		 * Atribui��o pode ser feita por aglutina��o
		 *******************************************/
		String s1 = ""+i;
		
		System.out.println(s1);
		
		String s2 = "11";
		//int j = s2 + i;
		
		
		/***********************************
		 * 
		 * 
		 * Vamos utilizar as classes Wrapper
		 * 
		 * em java.lang
		 * 
		 ***********************************/
		
		int k = Integer.parseInt(s2);
		int j = k + i;
		
		System.out.println(j);
		
		
		
		/***********************************
		 * 
		 * Classes Wrapper:
		 * 
		 * boolean -> Boolean
		 * char -> Character
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long ->Long
		 * float -> Float
		 * double -> Double
		 * 
		 * 
		 ************************************/
		
		
		
	}

}
