package bibliotecas;

public class TestaIntToString {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		
		/**********************************************************
		 * Atribuição direta entre tipos diferentes não é permitida
		 **********************************************************/
		//String s = i;
		
		/*******************************************
		 * Atribuição pode ser feita por aglutinação
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
