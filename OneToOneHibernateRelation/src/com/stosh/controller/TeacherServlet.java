package com.stosh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.stosh.model.PhoneNo;
import com.stosh.model.Teacher;

/**
 * Servlet implementation class TeacherServlet
 */
@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Teacher t1 = new Teacher();
			t1.setName("Mohan");
			t1.setAddress("Rolpa");
			
			
			Teacher t2 = new Teacher();
			t2.setName("Kiran");
			t2.setAddress("Dang");
			
			PhoneNo pn1 =new PhoneNo();
			pn1.setPhone("1111111");
			
			PhoneNo pn2 = new PhoneNo();
			pn2.setPhone("2222222");
			
			pn1.setTeacher(t1);
			pn2.setTeacher(t2);
			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			
			
			session.save(t1);
			session.save(t2);
			session.save(pn1);
			session.save(pn2);
			
			
			
			session.getTransaction().commit();
			session.close();
			
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
