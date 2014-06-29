<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mathias Teste</title>
</head>
<body>
	<a href="telaLogin.jsp">Tela login</a>
	<br>
	<a href="cadastroClienteTeste.jsp">Cadastro de cliente</a>
	<br>
	<a href="logado/index.jsp">Index Logado</a>
	<%String a = "";
		if (session.getAttribute("user_logged") != null) {
			if (session.getAttribute("user_logged").equals("true")) {
				a = "Seja Bem vindo, você agora está logado";
			}
		}
	%>
	<%=a%>
</body>
</html>