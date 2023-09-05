<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:url value="/novo-livro" var="novoLivro"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${novoLivro}" method="post">
		<label>
			Titulo:
			<input type="text" name="titulo">
		</label>
		<label>
			Gênero:
			<input type="text" name="genero">
		</label>
		<label>
			<input type="submit"/>
		</label>
	</form>
</body>
</html>