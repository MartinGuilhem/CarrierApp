package com.ITAcademy.carrierApp.Models;

import javax.persistence.Entity;

@Entity
public class Crew extends Person
{
	String Rank;
	boolean isInjured;
	
	public Crew()
	{
	}
	
	public String getRank()
	{
		return Rank;
	}
	public void setRank(String rank)
	{
		Rank = rank;
	}
	public boolean isInjured()
	{
		return isInjured;
	}
	public void setInjured(boolean isInjured)
	{
		this.isInjured = isInjured;
	}
	
	
}
