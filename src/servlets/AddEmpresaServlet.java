package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import models.Empresa;

@WebServlet(name="cadastrar-empresa", urlPatterns={"/empresa/cadastrar"})

public class AddEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String nomeFantasia = req.getParameter("nome");
		String cnpj = req.getParameter("cnpj");
		/*String telefone = req.getParameter("telefone");*/
		String email = req.getParameter("email");
		String end = req.getParameter("senha");
		

		Empresa empresa;
		empresa = new Empresa(razaoSocial,nomeFantasia,cnpj,telefone,email,end);

		req.getRequestDispatcher("ListServlet").forward(req, resp);

	}
}
