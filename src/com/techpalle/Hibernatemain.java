package com.techpalle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Student;

public class Hibernatemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
	      Session s=factory.openSession();
	      Transaction t=s.beginTransaction();
	      Student e1=new Student(3,"ramesh","java","male","ramesh@gmail.com","BE");
	      Student e2=new Student(4,"sur","python","female","su@gmail.com","BTECH");
	      s.save(e1);
	      s.save(e2);
	      t.commit();
	      s.close();
	      factory.close();

	}

}
