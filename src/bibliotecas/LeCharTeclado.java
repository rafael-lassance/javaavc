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
		//InputStream � a classe Java que sabe capturar um byte
		//Neste caso, da entrada padr�o do sistema.
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e trasnform�-lo em char
		char c = 0;
		
		try {
			c = (char) isr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Voc� digitou a tecla: " + c);
	
	}
}
