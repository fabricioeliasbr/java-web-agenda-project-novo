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

	public void cadastraDAO(Pessoas pessoa) {
		String SQL = "insert into pessoas (nome, email, endereco, telefone) values (?,?,?,?)";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getEndereco());
			stmt.setString(4, pessoa.getTelefone());
			stmt.execute();
			stmt.close();

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

			Pessoas pessoa = new Pessoas();

			pessoa.setNome(rs.getString("nome"));
			pessoa.setTelefone(rs.getString("telefone"));
			pessoa.setEmail(rs.getString("email"));
			pessoa.setEndereco(rs.getString("endereco"));
			pessoas.add(pessoa);

			stmt.close();
			this.connection.close();
			return pessoas;

		} catch (Exception e) {

		}
		return null;
	}
}