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
		pessoa.setCpf("d");
		pessoa.setDe_endereco("ef");
		pessoa.setEmail("wefw");
		pessoa.setNome("wfewf");
		pessoa.setNu_telefone("wefwef");
		pessoa.setNu_celular("ewfwef");
		pessoa.setRg("ewwfwfw");
		pessoa.setSenha("efwkjfwj");
		pessoa.setSexo("ewfkewf");
			
		PessoaDao pd = new PessoaDao();
		pd.inserir(pessoa);
	
		response.sendRedirect("index.jsp");
	}

}
