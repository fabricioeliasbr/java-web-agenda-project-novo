package com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.agenda.modelos.Pessoas;
import com.mysql.jdbc.Connection;

import util.ConnectionFactory;

public class PessoaDao {
	private Connection connection;
	private PreparedStatement stmt;
	
	public PessoaDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	public void cadastraDAO(Pessoas pessoa) {
		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";

		try {
			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getEmail());
			this.stmt.setString(3, pessoa.getEndereco());
			this.stmt.setString(4, pessoa.getTelefone());
			this.stmt.setLong(5, pessoa.getId());
			this.stmt.execute();
			this.stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Pessoas> buscaPessoas() {
		String SQL = "Select * from pessoas";

		try {
			this.connection = new ConnectionFactory().getConnection();

			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			List<Pessoas> pessoas = new ArrayList<Pessoas>();

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pessoas pessoa = new Pessoas();
				pessoa.setId(rs.getLong("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoas.add(pessoa);
			}
			stmt.close();
			this.connection.close();
			return pessoas;

		} catch (Exception e) {

		}
		return null;
	}

	public void removerContato(Pessoas pessoa) {

		String SQL = "delete from pessoas where id=?";
		
		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(SQL);
			this.stmt.setLong(1, pessoa.getId());
			this.stmt.execute();
			this.stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		// System.out.println("M�todo remover executado com sucesso");
	}

	public void alterar(Pessoas pessoa) {
		String SQL = "update pessoa set nome=?, email=?, endereco=?, telefone=? where id=?";
		try {
			
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getEndereco());
			stmt.setString(4, pessoa.getTelefone());
			stmt.setLong(5, pessoa.getId());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}