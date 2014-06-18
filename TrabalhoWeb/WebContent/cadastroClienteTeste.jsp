<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro cliente</title>
</head>
<body>
	<form name = "telaCadastro" action="CrudPessoa" method="post">
		Nome:     <input type="text" name="nome" ><br><br>
		Email:    <input type="text" name="email" ><br><br>
		Telefone: <input type="text" name="telefone" ><br><br>
		Celular:  <input type="text" name="celular" ><br><br>
		Cpf:      <input type="text" name="cpf" ><br><br>
		Endereço: <input type="text" name="endereco" ><br><br>
		Rg:       <input type="text" name="rg" ><br><br>
		Sexo      <input type="radio" name="sexo" value="Feminino" checked>Feminino  <input type="radio" name="sexo" value="Masculino"> Masculino<br><br>
		Senha:    <input type="password" name="senha">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>
