package resApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PopulateResume")
public class PopulateResume extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String resumeApp = ""; 
    private String resumeEd = ""; 
    private String resumeEx = ""; 
    private String resumeSk = ""; 
    
    public PopulateResume() {
        super();

    }
	
    /**protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nextPage = "/UserInfo.jsp";
		String msgAp = resumeApp;
		String msgEd = resumeEd;
		String msgEx = resumeEx;
		String msgSk = resumeSk;
		
		request.setAttribute("message", msgAp);
		request.setAttribute("message", msgEd);
		request.setAttribute("message", msgEx);
		request.setAttribute("message", msgSk);
		
		getServletContext().getRequestDispatcher(nextPage).forward(request, response);
	}*/
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nextPage = "/UserInfo.jsp";
		String msgAp = resumeApp;
		String msgEd = resumeEd;
		String msgEx = resumeEx;
		String msgSk = resumeSk;
		
		resumeApp = UpdateApplicant.GetApplicant(request.getParameter("email"));
		request.setAttribute("message", msgAp);

		resumeEd = UpdateEducation.GetEducation(request.getParameter("email"));
		request.setAttribute("message", msgEd);
	
		resumeApp = UpdateExperience.GetExperience(request.getParameter("email"));
		request.setAttribute("message", msgEx);

		resumeApp = UpdateSkill.GetSkill(request.getParameter("email"));
		request.setAttribute("message", msgSk);
		
		getServletContext().getRequestDispatcher(nextPage).forward(request, response);
	
	}

}
