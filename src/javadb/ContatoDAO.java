package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//regra de neg�cio
public class ContatoDAO {

	private Connection con;
	
	public ContatoDAO() throws SQLException {
		this.con = ConnectionFactory.getConnection();
		
	}
	
	public void adiciona(Contato contato) throws SQLException {
		String sql = "INSERT INTO contatos (nome, email, endereco) VALUES (?, ?, ?)";
		
		PreparedStatement stmt = this.con.prepareStatement(sql);
		
		stmt.setString(1, contato.getNome() );
		stmt.setString(2, contato.getEmail() );
		stmt.setString(3, contato.getEndereco() );
		
		stmt.execute();
		
		stmt.close();
		
		
	}
	
	public void altera(Long id, Contato contato) throws SQLException {
		String sql = "UPDATE contatos SET nome = ?, email = ?, endereco = ? WHERE id = ?";
		
		PreparedStatement stmt = this.con.prepareStatement(sql);
		
		stmt.setString(1, contato.getNome() );
		stmt.setString(2, contato.getEmail() );
		stmt.setString(3, contato.getEndereco() );
		stmt.setLong(4, id);
		
		stmt.execute();
		
		stmt.close();
		
		
	}
	
	public void remove(Long id) throws SQLException {
		String sql = "DELETE FROM contatos WHERE id = ?";
		
		PreparedStatement stmt = this.con.prepareStatement(sql);
		
		stmt.setLong(1, id);
		
		stmt.execute();
		
		stmt.close();
		
		
	}
	
	
	
	
	public List<Contato> getLista() throws SQLException {
		String sql = "SELECT * FROM contatos";
		
		PreparedStatement stmt = this.con.prepareStatement(sql);
		
		ResultSet rset = stmt.executeQuery();

		
		List <Contato> contatos = new ArrayList<Contato>();
		
		while(rset.next()) {
			Contato contato = new Contato();
			contato.setId(rset.getLong("id"));
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			
			contatos.add(contato);
			
		}
		
		rset.close();
		
		stmt.close();
		
		return contatos;
		
	}
	
	public void fechaConexao() throws SQLException {
		this.con.close();
	}
	
	
}
