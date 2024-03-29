package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PatientDao;
import beans.Patient;

/**
 * Servlet implementation class UpdatePatient
 */
@WebServlet("/Update")
public class UpdatePatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_MODIFIER_PATIENT = null;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		
		/*
		 * if(id != null && id.matches("[0-9]+")) { Patient patient =
		 * PatientDao.get(Integer.parseInt(id));
		 * 
		 * if(patient != null) { request.setAttribute("patient", patient);
		 * getServletContext().getRequestDispatcher(VUE_MODIFIER_PATIENT).forward(
		 * request, response); return; } }
		 */
		response.sendRedirect("list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
