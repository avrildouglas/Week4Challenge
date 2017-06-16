package resApp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckUserServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		/**get the list of elements*/
	/**	String education = request.getParameter("education");
		String experience = request.getParameter("experience");
		String skillrate = request.getParameter("skillrate"); */
		
		UpdateApplicant ap = new UpdateApplicant();
		UpdateEducation ed = new UpdateEducation();
		UpdateExperience ex = new UpdateExperience();
		UpdateSkill sk = new UpdateSkill();
		
		ArrayList<String> listEd = new ArrayList();
		ArrayList<String> listExp = new ArrayList();
		ArrayList<String> listSkills = new ArrayList();
			
		
		HttpSession session = request.getSession();
		
		session.setAttribute("sfirstName", firstName);
		session.setAttribute("slastName", lastName);
		session.setAttribute("semail", email);
		ap.AddApplicant(firstName, lastName, email);
		
		
	/**	session.setAttribute("seducation", education);
		ed.addEducation(listEd);
		
		session.setAttribute("sexperience", experience);
		ex.addExperience(listExp);
	
		session.setAttribute("sskillrate", skillrate);
		sk.addSkill(listSkills);
		
		getServletContext().getRequestDispatcher(nextPage).forward(request, response); */

}
}



