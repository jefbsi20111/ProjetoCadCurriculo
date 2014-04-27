package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import models.Candidato;

@WebServlet(name="cadastrar-candidato", urlPatterns={"/candidato/cadastrar"})

public class AddCandidatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		/*String telefone = req.getParameter("telefone");*/
		String email = req.getParameter("email");
		/*String end = req.getParameter("end");*/
		/*String nasc = req.getParameter("nasc");*/
		String escolaridade = req.getParameter("escolaridade");
		String exp = req.getParameter("exp");
		String area = req.getParameter("area");
		String apendices = req.getParameter("apendices");

		Candidato candidato;
		candidato = new Candidato(nome, cpf,email,escolaridade, exp, area);

		req.getRequestDispatcher("ListServlet").forward(req, resp);

	}
}
