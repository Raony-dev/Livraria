package br.com.facol.livraria;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.livraria.common.DataBaseLivraria;
import br.com.facol.livraria.model.Livro;

@WebServlet(urlPatterns = "/novo-livro")
public class NovoLivroBean extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private DataBaseLivraria baseLivraria = new DataBaseLivraria();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String genero = req.getParameter("genero");
		
		Livro livro = new Livro(titulo, genero);
		baseLivraria.cadastrar(livro);
		
		resp.sendRedirect("listar-livros");
		
	}
}
