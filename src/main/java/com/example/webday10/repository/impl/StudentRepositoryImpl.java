package com.example.webday10.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday10.entity.Student;
import com.example.webday10.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public StudentRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(Student s) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(s);
	}

}
