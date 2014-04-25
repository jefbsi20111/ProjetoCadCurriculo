package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Candidato;
import models.Empresa;

public class AddEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String razaoSocial = req.getParameter("razaoSocial");
		String nomeFantasia = req.getParameter("nomeFantasia");
		String cnpj = req.getParameter("cnpj");
		String telefone = req.getParameter("telefone");
		String email = req.getParameter("email");
		String end = req.getParameter("end");
		

		Empresa empresa;
		empresa = new Empresa(razaoSocial,nomeFantasia,cnpj,telefone,email,end);

		req.getRequestDispatcher("ListServlet").forward(req, resp);

	}
}
