<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Tarefas</title>
</head>
<body>
<h2>Lista de Tarefas</h2>
<table border = 1>
	<tr>
		<th>Tarefa</th>
		<th>Concluída</th>
		<th>Data para conclusão</th>
	</tr>
	<c:forEach var="tarefas" items="${tarefas}">
	<tr>
		<th>${tarefas.descricao}</th>
		<th>${tarefas.concluido}</th>
		<th>${tarefas.data}</th>
	<td>
		<form action = "removeTarefa" method = "post">
		<input type = "hidden" name = "id" value = "${tarefas.id}">
		<input type = "submit" value = "Remover" class = "btn btn-primary btn-block">
		</form>
	</td>
	</tr>
	
	</c:forEach>
</table>
</body>
</html>