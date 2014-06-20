package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PessoaDao;

@WebServlet("/LoginUser")
public class LoginUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PessoaDao pd = new PessoaDao();
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		HttpSession session = request.getSession();
		if (pd.retornarSenha(login, senha)){
			session.setAttribute("user_logged", "true");
		}else{
			session.setAttribute("user_logged", null);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/mathiasTeste.jsp");
		rd.forward(request, response);
	}

}
