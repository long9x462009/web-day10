package com.example.webday10.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String address;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FACULTY_ID", referencedColumnName = "ID")
	private Faculty faculty;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PASSPORT_ID", referencedColumnName = "ID")
	private Passport passport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
