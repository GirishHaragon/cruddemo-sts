package com.cruddemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Entity class is a Special class. These classes are mapped to the table of our DB. Moment we write @Entity Spring Boot will automatically based on the name, will search for the table in the DB & connect with that. Thats why we should give the same table name here as in DB & Spring Boot automatically does the work of Mapping. That's why we have given the name same. When we apply this annotation, it will make this an entity class, which means this class is mapped to the Db table.
public class Student {
	//Now we need to have the variables matching to the variables in the table of DB.
	@Id //Id here tells that (int id) is the primary key or if we apply this annotation over String name then the name will becomes primary key.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//To auto_increment the id variable we use this annotation. So this will automatically generate Id's
	private int id;
	private String name;
	private String course;
	private int fee;
	//This is where we achieve Encapsulation. Question may be asked as, Where have you used Encapsulation in your Project? -> While creating Entity Classes. And further in Dto class as well.
	
	//Then we generate Getters & Setters.
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
