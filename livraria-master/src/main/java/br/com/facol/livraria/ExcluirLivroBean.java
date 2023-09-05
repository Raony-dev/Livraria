package br.com.facol.livraria;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.livraria.common.DataBaseLivraria;

@WebServlet(urlPatterns = "/excluir-livros")
public class ExcluirLivroBean extends HttpServlet{
	
	private DataBaseLivraria baseLivraria = new DataBaseLivraria();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramID = req.getParameter("id");
		Integer id = Integer.parseInt(paramID);
		
		baseLivraria.excluirLivro(id);
		
		resp.sendRedirect("listar-livros");
	}
}
