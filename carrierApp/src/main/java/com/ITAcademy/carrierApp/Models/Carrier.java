package com.ITAcademy.carrierApp.Models;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carrier
{
	@Id
	String Id;
	String Name;
	String CarrierClass;
	//List<Crew> crewList;
	//List<Plane> planeList;

	public Carrier()
	{

	}

	public String getId()
	{
		return Id;
//		return UUID.fromString(Id);
	}

	public void setId(UUID id)
	{
		Id = id.toString();
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public String getCarrierClass()
	{
		return CarrierClass;
	}

	public void setCarrierClass(String carrierClass)
	{
		CarrierClass = carrierClass;
	}

	
	
//	public List<Crew> getCrewList()
//	{
//		return crewList;
//	}
//
//	public void setCrewList(List<Crew> crewList)
//	{
//		this.crewList = crewList;
//	}
//
//	public List<Plane> getPlaneList()
//	{
//		return planeList;
//	}
//
//	public void setPlaneList(List<Plane> planeList)
//	{
//		this.planeList = planeList;
//	}
	
	
	
	
	
}
