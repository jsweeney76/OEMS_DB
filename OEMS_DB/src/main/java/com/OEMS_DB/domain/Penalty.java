package com.OEMS_DB.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Penalty {

	private int ID;
	private String caseNumber;
	private double amtAssessed;
	private double amtSettled;
	private String paymentStatus;
	private String paymentMethod;
	private String datePaid;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getCaseNumber() 
	{
		return caseNumber;
	}
	
	public void setCaseNumber(String caseNumber) 
	{
		this.caseNumber = caseNumber;
	}
	
	public double getAmtAssessed() 
	{
		return amtAssessed;
	}
	
	public void setAmtAssessed(double amtAssessed) 
	{
		this.amtAssessed = amtAssessed;
	}
	
	public double getAmtSettled() 
	{
		return amtSettled;
	}
	
	public void setAmtSettled(double amtSettled) 
	{
		this.amtSettled = amtSettled;
	}
	
	public String getPaymentStatus() 
	{
		return paymentStatus;
	}
	
	public void setPaymentStatus(String paymentStatus) 
	{
		this.paymentStatus = paymentStatus;
	}
	
	public String getPaymentMethod() 
	{
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod) 
	{
		this.paymentMethod = paymentMethod;
	}
	
	public String getDatePaid() 
	{
		return datePaid;
	}
	
	public void setDatePaid(String datePaid) 
	{
		this.datePaid = datePaid;
	}
}
