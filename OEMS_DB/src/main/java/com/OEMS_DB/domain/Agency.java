package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agency {

	private int ID;
	private String agName;
	private String type;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String fName;
	private String lName;
	private String email;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getAgName() 
	{
		return agName;
	}
	
	public void setAgName(String agName) 
	{
		this.agName = agName;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getAddress1() 
	{
		return address1;
	}
	
	public void setAddress1(String address1) 
	{
		this.address1 = address1;
	}
	
	public String getAddress2() 
	{
		return address2;
	}
	
	public void setAddress2(String address2) 
	{
		this.address2 = address2;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	public String getZip() 
	{
		return zip;
	}
	
	public void setZip(String zip) 
	{
		this.zip = zip;
	}
	
	public String getfName() 
	{
		return fName;
	}
	
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	
	public String getlName() 
	{
		return lName;
	}
	
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
}
