package javadb;


//JavaBeans: POJO, objeto do negócio (POJO: Plain Old Java Objects)

//JavaBeans vs EJB (Enterprise JavaBeans)

//EJB vc Spring
//EJB e Spring: Java Programação Enterprise
//Java EE

//Este curso, antes de Java Web (próximo período), é de Java Standard
//Java Web é um subconjunto de Java Enterprise (Java EE)

//As tabelas do banco, na camada de programação viram classes JavaBeans...

//As colunas ou campos do banco, na camada de programação viram os atributos da classe,
// com as respectivas equivalências de tipos

//Nossa programação a partir de agora está em 3 camadas...
//A 1a camada, de baixo, é a camada do banco
//A camada do meio, é camada que faz a transição entre a aplicação e o banco...ou seja o JavaBeans
//Vamos agora programar a 3a camada, que é minha aplicação, uma classe que vai ter o método main...


/********************
 * 
 * @author Rafael
 *
 */

public class Contato {
	
	//vamos escolher utilizar a Wrapper class ao invés do tipo primitivo para Long
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
