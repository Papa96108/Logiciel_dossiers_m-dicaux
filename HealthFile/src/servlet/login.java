package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Utilisateur;
import Dao.loginDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE_LOGIN = "/WEB-INF/login.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch (request.getServletPath())
		{
		case "/login":
			getServletContext().getRequestDispatcher(VUE_LOGIN).forward(request, response);
		case "/logout":
			
			response.sendRedirect("login");
			HttpSession session = request.getSession();
			session.invalidate();
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("username");
		String password = request.getParameter("password");
		Utilisateur user= new Utilisateur(login, password);
		
		
		Boolean verif = loginDao.checkUser(user);
		
		if (verif) {
			HttpSession session = request.getSession();
			session.setAttribute("isConnected", true);
			response.sendRedirect("List");
		}
		else
		{
			  request.setAttribute("connexionFailed", true);
			  getServletContext().getRequestDispatcher(VUE_LOGIN).forward(request, response);
		
		}
	}

}
