package com.StudentServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.modals.StudentReport;
import com.studentDao.Student;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
//			String a = "123";
//			int x = 0;
//			int i = Integer.parseInt(a);
			
			StudentReport  sr = new StudentReport ();
			sr.setAge(Integer.parseInt(request.getParameter("age")));
			sr.setPosition(Integer.parseInt(request.getParameter("position")));
			sr.setStudentAddress(request.getParameter("studentAddress"));
			sr.setStudentPhoneNumber(Integer.parseInt(request.getParameter("studentPhoneNumber")));
			sr.setStudentEmail(request.getParameter("studentEmail"));
			sr.setClassTeacher(request.getParameter("classTeacher"));
			sr.setParentsName(request.getParameter("parentsName"));
			sr.setStudentClass(Integer.parseInt(request.getParameter("studentClass")));
			sr.setStudentFirstName(request.getParameter("studentFirstName"));
			sr.setStudentLastName(request.getParameter("studentLastName"));
			sr.setStudentClass(Integer.parseInt(request.getParameter("studentClass")));
			
			
			
			
			Student st = new Student();
			st.insertStudentData(sr);
			
			response.sendRedirect("form.jsp");
			
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
