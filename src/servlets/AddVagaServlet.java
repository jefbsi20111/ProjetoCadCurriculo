package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import models.Vaga;

@WebServlet(name="cadastrar-vaga", urlPatterns={"/vagas/cadastrar"})

public class AddVagaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String cargaHoraria = req.getParameter("cargaHoraria");
		String remuneracao = req.getParameter("remuneraca");
		String requisitos = req.getParameter("requisitos");
		//String desc = req.getParameter("desc");
		

		Vaga vaga;
		vaga = new Vaga(cargaHoraria,remuneracao,requisitos);

		req.getRequestDispatcher("ListServlet").forward(req, resp);

	}
}
