package co.stosh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.stosh.modal.Student;
import co.stosh.studentDao.StudentDao;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDao sdo = new StudentDao();
		Student st1 = new Student();
		
		try {
			if(request.getParameter("add")!=null) {
				
				st1.setFirstName(request.getParameter("FirstName"));
				st1.setLastName(request.getParameter("LastName"));
				st1.setPassword(request.getParameter("Password"));
				st1.setAddress(request.getParameter("Address"));
				sdo.insertStudentInfo(st1);
//				response.sendRedirect("SignUpLogin-Form.jsp");
//				return;
				
			}else if(request.getParameter("idForDelete")!=null) {
				int id1 = Integer.parseInt(request.getParameter("idForDelete"));
				sdo.deleteStudent(id1);
				
			}else if(request.getParameter("idForEdit")!=null) {
				int id2 = Integer.parseInt(request.getParameter("idForEdit"));
				
				
				Student st5 = sdo.getStudent(id2);
				request.setAttribute("ss1", st5);
				
				RequestDispatcher rd5 = request.getRequestDispatcher("form.jsp");
				rd5.forward(request,response);
				return;
				
			}else if(request.getParameter("update")!=null) {
				int id5 = Integer.parseInt(request.getParameter("id6"));
				
				Student st8 = new Student();
				st8.setId(id5);
				st8.setFirstName(request.getParameter("FirstName"));
				st8.setLastName(request.getParameter("LastName"));
				st8.setAddress(request.getParameter("Address"));
				String s1 = "Ram";
				sdo.updateStudent(st8);
				
			}
			
						
	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		try {
			//StudentDao sdo1 = new StudentDao();
			List <Student> li = sdo.getStudentreportList();
			
			request.setAttribute("sList1", li);
			
			RequestDispatcher rtd = request.getRequestDispatcher("Form-list.jsp");
			rtd.forward(request, response);
			
			
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
