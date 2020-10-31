package jthread;

public class TestaThread {
	
	public static void main(String[] args) {
		
		DesenhaMapa dMapa = new DesenhaMapa();
		
		Thread tMapa = new Thread(dMapa);
		
		tMapa.start();//dispara athread na minha JVM
		
		BarraDeProgresso bProg = new BarraDeProgresso();
		
		Thread tBProg = new Thread(bProg);
		
		tBProg.start();
		
	}

}
