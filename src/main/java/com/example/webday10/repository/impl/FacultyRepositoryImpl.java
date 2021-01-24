package com.example.webday10.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webday10.entity.Faculty;
import com.example.webday10.repository.FacultyRepository;

@Repository
public class FacultyRepositoryImpl implements FacultyRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public FacultyRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(Faculty f) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(f);

		String name = f.getName();
		name = name + " Edited in Managed state";
		f.setName(name);

	}

}
