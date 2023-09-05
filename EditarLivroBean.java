package br.com.facol.livraria;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.facol.livraria.common.DataBaseLivraria;
import br.com.facol.livraria.model.Livro;

@WebServlet(urlPatterns = "/editar-livro")
public class EditarLivroBean extends HttpServlet{
	
	private static DataBaseLivraria baseLivraria = new DataBaseLivraria();
    	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramTitulo = req.getParameter("titulo");
		String paramGenero = req.getParameter("genero");
		String paramId = req.getParameter("id");
		
		Integer id = Integer.parseInt(paramId);
		
		Livro livro = baseLivraria.buscarLivroPorID(id);
		livro.setTitulo(paramTitulo);
		livro.setGenero(paramGenero);
		
		resp.sendRedirect("listar-livros");
		
	}
}
