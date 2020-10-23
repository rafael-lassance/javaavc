package bibliotecas;

/****************************
*
* Classes da Biblioteca IO
*
****************************/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite uma tecla:");
		
		InputStream is = System.in;
		//InputStream é a classe Java que sabe capturar um byte
		//Neste caso, da entrada padrão do sistema.
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e trasnformá-lo em char
		char c = 0;
		
		try {
			c = (char) isr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Você digitou a tecla: " + c);
	
	}
}
