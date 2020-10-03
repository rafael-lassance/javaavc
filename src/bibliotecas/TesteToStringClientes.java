package bibliotecas;

public class TesteToStringClientes {
	
	public static void main(String[] args) {
		
		Cliente1 c1 = new Cliente1();
		
		System.out.println(c1.toString());
		

		/*****************************************
		 *
		 * chama automaticamente o método toString
		 *
		 ****************************************/
		System.out.println(c1);
		
		
		
		Cliente2 c2 = new Cliente2("Java");
		
		Cliente2 c3 = new Cliente2(null);
		
		System.out.println(c2);
		System.out.println(c2.toString());
		
		
		
		
		
		
	}

}
