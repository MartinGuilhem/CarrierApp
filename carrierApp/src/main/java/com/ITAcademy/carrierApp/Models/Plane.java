package com.ITAcademy.carrierApp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plane
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int Id;
	String SerialNumber;
	String Model;
	
	public Plane()
	{
	}

	public int getId()
	{
		return Id;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public String getSerialNumber()
	{
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		SerialNumber = serialNumber;
	}

	public String getModel()
	{
		return Model;
	}

	public void setModel(String model)
	{
		Model = model;
	}
	
	
	
}
