package com.stosh.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.stosh.Model.Product;
import com.stosh.Util.HibernateUtil;


@Repository
public class ProductDao {
	
	public void insertProduct(Product prd) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(prd);
			session.getTransaction().commit();
			session.close();
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public List<Product> getProductList(){
		try {
			List<Product> li = new ArrayList<Product>();
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			
			
			Query qry = session.createQuery("from Product");
			li = qry.list();
			session.getTransaction().commit();
			session.close();
			return li;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public Product getProduct(int productId) {
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Product product = session.get(Product.class, productId);		
			session.getTransaction().commit();
			session.close();
			return product;		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
		
		
		
	
	
	public void deleteProduct(int productId) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Product product = session.load(Product.class, productId);	
			session.delete(product);
			session.getTransaction().commit();
			session.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateProduct(Product prdt) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			session.getTransaction().commit();
			session.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
