package com.stosh.controller;

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

import com.stosh.model.DAddress;
import com.stosh.model.Doctor;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/DoctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Doctor d1 = new Doctor();
			Doctor d2 = new Doctor();
			Doctor d3 = new Doctor();
			Doctor d4 = new Doctor();
			Doctor d5 = new Doctor();
			Doctor d6 = new Doctor();
			
			d1.setName("Ram");
			d1.setEmail("r@r.com");
			d1.setPhoneNo("213124324");
			
			
			d2.setName("Hari");
			d2.setEmail("h@h.com");
			d2.setPhoneNo("3245345345");
			
			
			d3.setName("Krishna");
			d3.setEmail("k@k.com");
			d3.setPhoneNo("34563465476");
			
			
			d4.setName("Ganesh");
			d4.setEmail("g@g.com");
			d4.setPhoneNo("89789797897");
			
			d5.setName("Naresh");
			d5.setEmail("n@n.com");
			d5.setPhoneNo("4534536565567");
			
			d6.setName("Chetan");
			d6.setEmail("c@c.com");
			d6.setPhoneNo("987785467678");
			
			
//			*****************************Address*******************
			
			DAddress a1 = new DAddress();
			DAddress a2 = new DAddress();
			DAddress a3 = new DAddress();
			DAddress a4 = new DAddress();
			DAddress a5 = new DAddress();
			DAddress a6 = new DAddress();
			
			a1.setHouseNo("12");
			a1.setStreetName("Barbara");
			a1.setCity("FW");
			a1.setZipcode("76108");
			
			
			a2.setHouseNo("14");
			a2.setStreetName("Roman");
			a2.setCity("Irving");
			a2.setZipcode("76109");
			
			a3.setHouseNo("24");
			a3.setStreetName("George");
			a3.setCity("Denton");
			a3.setZipcode("76669");
			
			a4.setHouseNo("10");
			a4.setStreetName("Bryan");
			a4.setCity("Haltom");
			a4.setZipcode("45632");
			
			a5.setHouseNo("103");
			a5.setStreetName("Melisa");
			a5.setCity("GreenWich");
			a5.setZipcode("33555");
			
			a6.setHouseNo("444");
			a6.setStreetName("Westlake");
			a6.setCity("Dallas");
			a6.setZipcode("56341");
			
			
			List<DAddress> l1 = new ArrayList<>();
				l1.add(a1);
				l1.add(a2);
				l1.add(a3);
				
			List<DAddress> l2 = new ArrayList<>();
				l2.add(a4);
				l2.add(a5);
				l2.add(a6);
				
				
			List<DAddress> l3 = new ArrayList<>();
				l3.add(a4);
				l3.add(a6);
				l3.add(a1);
				l3.add(a2);
			
			List<DAddress> l4 = new ArrayList<>();
				l4.add(a5);
				l4.add(a1);
				l4.add(a3);
					
			List<DAddress> l5 = new ArrayList<>();
				l5.add(a4);
				l5.add(a2);
				l5.add(a1);
				l5.add(a6);
				l5.add(a3);
				l5.add(a4);
				l5.add(a5);
		
//			**********************Assign these doctors in the different addresses*************
				
				d1.setdAddressList(l1);
//				d1.setdAddressList(l4);
//				d1.setdAddressList(l5);
				d2.setdAddressList(l2);
//				d2.setdAddressList(l1);
//				d2.setdAddressList(l5);
				d3.setdAddressList(l3);
				d4.setdAddressList(l4);
				d5.setdAddressList(l4);
//				d5.setdAddressList(l4);
//				d5.setdAddressList(l5);			
				d6.setdAddressList(l5);
				
				
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session session = sf.openSession();
					session.beginTransaction();
					
					
//					session.save(l1);
//					session.save(l2);
//					session.save(l3);
//					session.save(l4);
//				    session.save(l5);
					session.save(a1);
					session.save(a2);
					session.save(a3);
					session.save(a4);
					session.save(a5);
					session.save(a6);
					session.save(d1);
					session.save(d2);
					session.save(d3);
					session.save(d4);
					session.save(d5);
					session.save(d6);
					
					
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
