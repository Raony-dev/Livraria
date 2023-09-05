<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<c:url value="/editar-livro" var="editarLivro"></c:url>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${editarLivro}" method="post">
		<label>
			Titulo:
			<input type="text" name="titulo" value="${livros.titulo}">
		</label>
		<label>
			Gênero:
			<input type="text" name="genero" value="${livros.genero}">
		</label>
		<input type="hidden" name="id" value="${livros.id}"/>
		<input type="submit">
	</form>
</body>
</html>