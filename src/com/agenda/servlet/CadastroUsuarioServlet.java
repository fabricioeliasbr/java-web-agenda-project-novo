package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelos.Pessoas;
import com.agenda.service.CadastroUsuarioService;

public class CadastroUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		
		Pessoas pessoa = new Pessoas();
		
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setTelefone(request.getParameter("telefone"));
		pessoa.setEndereco(request.getParameter("endereco"));
	
		CadastroUsuarioService service = new CadastroUsuarioService();
		
		if(null != request.getParameter("id") && !request.getParameter("id").equals("")) {			
			pessoa.setId(Long.parseLong(request.getParameter("id")));
			service.cadastrarOuAlterar(pessoa);
		}
		
		response.sendRedirect("busca-contatos");
	}

}
