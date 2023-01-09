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
 * Servlet implementation class AddPatient
 */
@WebServlet("/Add")
public class AddPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_AJOUT_PATIENT = "/WEB-INF/add-patient.jsp";
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher(VUE_AJOUT_PATIENT).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		 	String name = request.getParameter("name");
		    int age = Integer.parseInt(request.getParameter("age"));
		    String gender = request.getParameter("gender");
		    String address = request.getParameter("address");
		    String phoneNumber = request.getParameter("phoneNumber");
		    
		    PatientDao.ajouter(new Patient(name, age, gender, address, phoneNumber));
		    
		    response.sendRedirect("List");
		
	}

}
