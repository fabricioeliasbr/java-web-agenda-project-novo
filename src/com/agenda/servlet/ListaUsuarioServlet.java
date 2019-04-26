package com.agenda.servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelos.Pessoas;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/busca-contatos")
public class ListaUsuarioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private CadastroUsuarioService service;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.service = new CadastroUsuarioService();
		List<Pessoas> pessoas = this.service.buscaPessoas();
		request.setAttribute("contatos", pessoas);
		request.getRequestDispatcher("listar-contato.jsp").forward(request, response);
	}
	
}