package com.ITAcademy.carrierApp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Person
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	String Name;
	String Surname;
	String DNI;
	
	public Person()
	{
		
	}
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getSurname()
	{
		return Surname;
	}
	public void setSurname(String surname)
	{
		Surname = surname;
	}
	public String getDNI()
	{
		return DNI;
	}
	public void setDNI(String dNI)
	{
		DNI = dNI;
	}
	
	
}
