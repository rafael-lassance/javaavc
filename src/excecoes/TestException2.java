package excecoes;

import java.io.FileNotFoundException;

public class TestException2 {
	
	public static void main(String[] args) {
		try {
			new java.io.FileReader("arquivoDeTeste.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
