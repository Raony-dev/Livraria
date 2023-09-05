<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.facol.livraria.model.Livro"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/listar-livros" var="listar"/>	  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Livros</title>
</head>
<body>
	<a href="formNovoLivro.jsp">Cadastrar Livro</a>
	<ul>
		<c:forEach items="${livros}" var="livros">
			<li>
				<p>Titulo: ${livros.titulo }</p>
				<p>Gênero: ${livros.genero }</p>
				<a href="/livraria/excluir-livros?id=${livros.id}">Excluir</a>
				<a href="/livraria/carregar-livro?id=${livros.id}">Editar</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>