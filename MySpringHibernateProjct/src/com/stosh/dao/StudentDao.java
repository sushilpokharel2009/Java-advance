package com.stosh.dao;

//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Query;
//
//import org.hibernate.Session;
//import org.springframework.stereotype.Repository;
//
//import com.stosh.model.Student;
//import com.stosh.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.stosh.model.Student;
import com.stosh.util.HibernateUtil;


@Repository
public class StudentDao {
	
	
	public void insertStudent(Student st) {
		
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(st);
			session.getTransaction().commit();
			session.close();
						
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public List<Student> getStudentList(){
		try {
			List<Student> studentLists = new ArrayList<Student>();
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			Query qry = (Query) session.createQuery("from Student");			
			studentLists = qry.list();
			
			session.getTransaction().commit();
			session.close();
			
			return studentLists;
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return null;
	}
}
