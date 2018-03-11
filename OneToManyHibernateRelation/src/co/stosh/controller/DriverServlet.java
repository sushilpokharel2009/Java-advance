package co.stosh.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.stosh.model.Driver;
import co.stosh.model.Phone;

/**
 * Servlet implementation class DriverServlet
 */
@WebServlet("/DriverServlet")
public class DriverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DriverServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			********************DRIVER 1*************************************
			Driver d1 = new Driver();
			d1.setName("Suman");
			d1.setAddress("Ktm");
			
			Phone p1 = new Phone();
			p1.setPhoneNumber("11111111111");
			p1.setDr(d1);
			
			
			
			Phone p2 = new Phone();
			p2.setPhoneNumber("22222222");
			p2.setDr(d1);
			
			Phone p3 = new Phone();
			p3.setPhoneNumber("33333333");
			p3.setDr(d1);
			
//			********************DRIVER 2*************************************
			
			Driver d2 = new Driver();
			d2.setName("Krishna");
			d2.setAddress("Btwl");
			
			Phone p4 = new Phone();
			p4.setPhoneNumber("444444444");
			p4.setDr(d2);
			
			Phone p5 = new Phone();
			p5.setPhoneNumber("555555555");
			p5.setDr(d2);
			
			Phone p6 = new Phone();
			p6.setPhoneNumber("666666666666");
			p6.setDr(d2);
			
//			***********************DRIVER 3*************************************************************************
			
			
			Driver d3 = new Driver();
			d3.setName("Home");
			d3.setAddress("Bara");
			
			Phone p7 = new Phone();
			p7.setPhoneNumber("77777777777777");
			p7.setDr(d3);
			
			
			Phone p8 = new Phone();
			p8.setPhoneNumber("888888888888888");
			p8.setDr(d3);
			
			
			Phone p9 = new Phone();
			p9.setPhoneNumber("9999999999999999");
			p9.setDr(d3);
			
//			************************DRIVER 4***********************************************************************
			
			Driver d4 = new Driver();
			d4.setName("Nabin");
			d4.setAddress("Kapilvastu");
			
			
			Phone p10 = new Phone();
			p10.setPhoneNumber("10101010101");
			p10.setDr(d4);
			
			Phone p11 = new Phone();
			p11.setPhoneNumber("89757875897589789");
			p11.setDr(d4);
			
			Phone p12 = new Phone();
			p12.setPhoneNumber("0090000067567565");
			p12.setDr(d4);
			
//			**********************MAKING LIST AND ASSIGN INTO LIST**********************************************
			
			List<Phone> l1 = new ArrayList<>();
			l1.add(p1);
			l1.add(p2);
			l1.add(p3);
			
			
			
			List<Phone> l2 = new ArrayList<>();
			l2.add(p4);
			l2.add(p5);
			l2.add(p6);
			
			
			List<Phone> l3 = new ArrayList<>();
			l3.add(p7);
			l3.add(p8);
			l3.add(p9);
			
			
			
			List<Phone> l4 = new ArrayList<>();
			l4.add(p10);
			l4.add(p11);
			l4.add(p12);
			
//			******************ASSIGNING LIST INTO DRIVER NOW************************************************
			
			d1.setDiverPhoneNumbers(l1);
			d2.setDiverPhoneNumbers(l2);
			d3.setDiverPhoneNumbers(l3);
			d4.setDiverPhoneNumbers(l4);
			
//			***************SESSION FACTORY*******************************************************************
			
			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session se = sf.openSession();
			se.beginTransaction();
			
			
			
			se.save(d1);
			se.save(d2);
			se.save(d3);
			se.save(d4);
			se.save(p1);			
			se.save(p2);
			se.save(p3);
			se.save(p4);
			se.save(p5);
			se.save(p6);
			se.save(p7);
			se.save(p8);
			se.save(p9);
			se.save(p10);
			se.save(p11);
			se.save(p12);
			
			
			
			
			
			se.getTransaction().commit();
			se.close();
			
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
