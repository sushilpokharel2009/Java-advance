package co.stosh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.stosh.modal.LogIn;
import co.stosh.modal.Student;
import co.stosh.studentDao.LogInDao;
import co.stosh.studentDao.StudentDao;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			
			LogInDao lid = new LogInDao();
			LogIn l1 = new LogIn();
			
			if(request.getParameter("createNewAccount")!=null) {
				l1.setFirstName(request.getParameter("firstName"));
				l1.setLastName(request.getParameter("lastName"));
				l1.setPassword(request.getParameter("password"));
				l1.setAddress(request.getParameter("address"));
				
				LogIn lgnUser = lid.insertLogInInfo(l1);
//				response.sendRedirect("SignUpLogin-Form.jsp");
//			    return;
				
				
				
			}else if(request.getParameter("Login")!=null) {
				
				l1.setFirstName(request.getParameter("firstName"));
				l1.setLastName(request.getParameter("lastName"));
				l1.setPassword(request.getParameter("password"));
				l1.setAddress(request.getParameter("address"));
				
				LogIn lgnUser2 = lid.verifyUser(l1);
				//response.sendRedirect("SignUpLogin-Form.jsp");
				if(lgnUser2!=null) {
					HttpSession session = request.getSession();
					session.setAttribute("vdfUser", lgnUser2);
					response.sendRedirect("home.jsp");
					
				}else {
					response.sendRedirect("SignUpLogin-Form.jsp? in = invalidate");
				}
				return;
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
