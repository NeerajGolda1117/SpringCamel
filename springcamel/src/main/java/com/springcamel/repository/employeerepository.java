package com.springcamel.repository;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class employeerepository {

	@Autowired
	private SessionFactory sesf;
	
	@Transactional
	public String getDetails(int id)
	{
		try {
			Session ses = sesf.getCurrentSession();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return null;
		
		
	}
	
	
}
