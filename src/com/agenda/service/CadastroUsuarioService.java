package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDao;
import com.agenda.modelos.Pessoas;

public class CadastroUsuarioService {

	public void cadastra(Pessoas pessoa) {
		PessoaDao userDAO = new PessoaDao();
			
		userDAO.cadastraDAO(pessoa);
		
	}
	
	public List<Pessoas> buscaPessoas(){
		PessoaDao userDAO = new PessoaDao();
		return userDAO.buscaPessoas();
	}

}
