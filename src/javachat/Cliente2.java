package javachat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class Cliente2 extends JFrame {

	private JPanel contentPane;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
				/*******************************
				 * Inicia Socket
				 *******************************/
		
				Socket client = new Socket("127.0.0.1", 10000);
				
				System.out.println("Cliente conectado ao servidor!");
				
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							/*******************************
							 * Inicia frame 
							 *******************************/
							
							Cliente2 frame = new Cliente2();
							frame.setVisible(true);
				
							Scanner s;
							PrintStream out = new PrintStream(client.getOutputStream());
							
				
							/*******************************
							 * Lê o texto da TextArea 
							 *******************************/
							
							/*
							s = new Scanner(new InputStream() {
								
								@Override
								public int read() throws IOException {
									// TODO Auto-generated method stub
									frame.textArea.getText();
									return 0;
								}
							});
							
							*/
							
							s = new Scanner(frame.textArea.getText());
								
							
							while(s.hasNextLine()) {
								out.println(s.nextLine());
							}
							
							
							
						//	PrintStream out = new PrintStream(client.getOutputStream());
						
							
						//  out.println(frame.textArea.getText());
							
							
							out.close();
							s.close();
							client.close();

							
					
					
						}
						  catch (Exception e) {
							e.printStackTrace();
						}
					}
						
				});
				
				
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	/**
	 * Create the frame.
	 * @return 
	 */
	public Cliente2() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}
		
		
		
	

}
