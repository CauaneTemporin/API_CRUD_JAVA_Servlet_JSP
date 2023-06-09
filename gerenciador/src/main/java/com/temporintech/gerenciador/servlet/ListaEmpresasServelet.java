  package com.temporintech.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class ListaEmpresasServelet
@WebServlet("/listaEmpresas")
public class ListaEmpresasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Fornecedor> lista = banco.getFornecedor();
		request.setAttribute("fornecedores", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ListaFornecedores.jsp");
		rd.forward(request, response);
	}
}
