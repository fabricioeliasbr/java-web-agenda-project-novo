package com.agenda.dao;

import com.agenda.modelos.Pessoas;
import com.mysql.jdbc.Connection;

public class PessoaDao {
	private Connection connection;
	
	public void cadastraDAO(Pessoas pessoa) {
		String SQL = "insert into pessoas (email, endereço, id, nome, telefone) values (?,?,?,?,?)";
		/*System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSenha());
		System.out.println(pessoa.getEmail());		
		System.out.println(pessoa.getTelefone());
		System.out.println(pessoa.getEndereco());*/
	}

}
