package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDao;
import com.agenda.modelos.Pessoas;

public class CadastroUsuarioService {

	private PessoaDao dao = new PessoaDao();
	
	public List<Pessoas> buscaPessoas(){
		return dao.buscaPessoas();
	}
	
	public void removerContato(Pessoas pessoa) {
		dao.removerContato(pessoa);
	}

	public void cadastrarOuAlterar (Pessoas pessoa) {
		if(0 != pessoa.getId()) {
			dao.alterar(pessoa);
		}else {
			dao.cadastraDAO(pessoa);
		}
	}
}