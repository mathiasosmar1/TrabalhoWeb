package servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Pessoa;
import dao.PessoaDao;

@WebServlet("/CrudPessoa")
public class CrudPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Pessoa pessoa = new Pessoa();
			pessoa.setCpf(request.getParameter("cpf"));
			pessoa.setDe_endereco(request.getParameter("endereco"));
			pessoa.setEmail(request.getParameter("email"));
			pessoa.setNome(request.getParameter("nome"));
			pessoa.setNu_telefone(request.getParameter("telefone"));
			pessoa.setNu_celular(request.getParameter("celular"));
			pessoa.setRg(request.getParameter("rg"));
			pessoa.setSenha(request.getParameter("senha"));
			pessoa.setSexo(request.getParameter("sexo"));
			PessoaDao pd = new PessoaDao();
			pd.inserir(pessoa);
			response.sendRedirect("telaLogin.jsp");
}
}
