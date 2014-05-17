package jdbc;

import dao.CandidatoDAO;

public class TestRemove {

	public static void main(String[] args) {
		String s = "Eduardo";
		CandidatoDAO dao = new CandidatoDAO();
		dao.remover(s);

	}

}
