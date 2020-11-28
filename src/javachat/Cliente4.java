package javachat;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente4 extends JFrame{

	private JPanel contentPane;
	JTextArea textArea;
	JButton btnEnviar;
	
	static Socket client;
	static PrintStream out;
	static Cliente4 frame; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
				/*******************************
				 * Inicia Socket
				 *******************************/
		
				client = new Socket("127.0.0.1", 10000);
				
				System.out.println("Cliente conectado ao servidor!");
				
		//		out = new PrintStream(client.getOutputStream());
				
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							/*******************************
							 * Inicia frame 
							 *******************************/
							
							frame = new Cliente4();
							frame.setVisible(true);
							//frame.textArea.addKeyListener(frame);
							//frame.btnEnviar.addActionListener(frame);
							
							
					
						}
						  catch (Exception e) {
							e.printStackTrace();
						}
					}
						
				});				
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	/**
	 * Create the frame.
	 * @return 
	 */
	public Cliente4() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Handler handler = new Handler();
		
		textArea = new JTextArea();
		textArea.addKeyListener(handler);
		contentPane.add(textArea, BorderLayout.CENTER);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(handler);
		contentPane.add(btnEnviar, BorderLayout.SOUTH);
	}
	
	public class Handler implements ActionListener, KeyListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar) {
				
				try {			
					
					out = new PrintStream(client.getOutputStream());
					 
					out.println(textArea.getText());
					
					textArea.setText("");
					
					//client.close();
				//	out.
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

	/*
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	*
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.equals(KeyEvent.VK_C)) {
			client.close();
			out.close();
		}
	}
	/*
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnviar) {
		
		try {			
			
			out = new PrintStream(client.getOutputStream());
			 
			out.println(this.textArea.getText());
			
			this.textArea.setText("");
			
			out
			//client.close();
			//out.close();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	}
}
*/
		