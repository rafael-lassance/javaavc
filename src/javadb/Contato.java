package javadb;


//JavaBeans: POJO, objeto do neg�cio (POJO: Plain Old Java Objects)

//JavaBeans vs EJB (Enterprise JavaBeans)

//EJB vc Spring
//EJB e Spring: Java Programa��o Enterprise
//Java EE

//Este curso, antes de Java Web (pr�ximo per�odo), � de Java Standard
//Java Web � um subconjunto de Java Enterprise (Java EE)

//As tabelas do banco, na camada de programa��o viram classes JavaBeans...

//As colunas ou campos do banco, na camada de programa��o viram os atributos da classe,
// com as respectivas equival�ncias de tipos

//Nossa programa��o a partir de agora est� em 3 camadas...
//A 1a camada, de baixo, � a camada do banco
//A camada do meio, � camada que faz a transi��o entre a aplica��o e o banco...ou seja o JavaBeans
//Vamos agora programar a 3a camada, que � minha aplica��o, uma classe que vai ter o m�todo main...


/********************
 * 
 * @author Rafael
 *
 */

public class Contato {
	
	//vamos escolher utilizar a Wrapper class ao inv�s do tipo primitivo para Long
	//para poder utilizar os metodos da classe
	private Long id;
	
	private String nome;
	private String email;
	private String endereco;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
