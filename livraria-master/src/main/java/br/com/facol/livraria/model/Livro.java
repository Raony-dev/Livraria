package br.com.facol.livraria.model;

import java.util.UUID;

public class Livro {
	
	private Integer id;
	private String titulo;
	private Integer quantidadeDePagina;
	private String genero;
	private String isbn;
	
	public Livro(Integer id, String titulo, Integer quantidadeDePagina, String genero, String isbn) {
		this.id = id;
		this.titulo = titulo;
		this.quantidadeDePagina = quantidadeDePagina;
		this.genero = genero;
		this.isbn = isbn;
	}
	
	public Livro(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}
	
	

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getQuantidadeDePagina() {
		return quantidadeDePagina;
	}

	public void setQuantidadeDePagina(Integer quantidadeDePagina) {
		this.quantidadeDePagina = quantidadeDePagina;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	
	
	
}
