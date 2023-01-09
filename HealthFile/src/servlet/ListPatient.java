package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PatientDao;

/**
 * Servlet implementation class ListPatient
 */
@WebServlet("/List")
public class ListPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_LIST_PATIENT = "/WEB-INF/list-patients.jsp";
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 // Envoie la liste des patients à la vue pour affichage
	    request.setAttribute("patients", PatientDao.lister());
	    getServletContext().getRequestDispatcher(VUE_LIST_PATIENT).forward(request, response);
	}


}
