package br.com.facol.livraria.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.facol.livraria.model.Livro;

public class DataBaseLivraria {
	
	private static List<Livro> listLivros = new ArrayList<Livro>();
	private static Integer chaveSequencial = 1;
	
	static {
		Livro livro1 = new Livro(chaveSequencial++,"Pedra Filosofal",300,"Fantasia","9-000-1234");
		
		Livro livro2 = new Livro(chaveSequencial++,"Crepusculo",400,"Fantasia","9-000-4321");
		
		listLivros.add(livro1);
		listLivros.add(livro2);
	}
	
	public List<Livro> listarLivros() {
		return listLivros;
	}
	
	public void cadastrar(Livro livro) {
		livro.setId(chaveSequencial++);
		this.listLivros.add(livro);
	}
	
	public void excluirLivro(Integer id) {
		Iterator<Livro> it = listLivros.iterator();
		
		while(it.hasNext()) {
			Livro livro = it.next();
			if(livro.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Livro buscarLivroPorID(Integer id) {
		for(Livro livro : listLivros) {
			if(livro.getId() == id) {
				return livro;
			}
		}
		return null;
	}
}
