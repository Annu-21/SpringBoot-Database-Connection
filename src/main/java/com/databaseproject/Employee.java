package com.databaseproject;

import jakarta.persistence.*;

@Entity
@Table //to create table; since name is not mentioned table of employee name will be created
public class Employee 
{
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="FullName")
	private String name;
	@Column
	private float sal;
	
	public Employee(String name, float sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	

}
