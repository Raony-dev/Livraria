package br.com.facol.livraria;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.facol.livraria.common.DataBaseLivraria;
import br.com.facol.livraria.model.Livro;

@WebServlet("/listar-livros")
public class ListarLivrariaBean extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		DataBaseLivraria baseLivraria = new DataBaseLivraria();

		List<Livro> livros = baseLivraria.listarLivros();
		
		req.setAttribute("livros", livros);
		
		RequestDispatcher rd = req.getRequestDispatcher("listar-livros.jsp");
		rd.forward(req, resp);

	}
}
