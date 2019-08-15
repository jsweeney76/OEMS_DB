package com.OEMS_DB.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CHF {

	private int ID;
	private String openDate;
	private String caseNumber;
	private String lName;
	private String p;
	private String fName;
	private String stateID;
	private String certLevel;
	private String status;
	private String action;
	private int offYr;
	private String offense;
	private int dispoYr;
	private String disposition;
	private String note;
	private String upDate;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone;
	private String status2;
	private String entryBy;
	private String entryDate;
	private String supRec;
	private String oldID;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getOpenDate() 
	{
		return openDate;
	}
	
	public void setOpenDate(String openDate) 
	{
		this.openDate = openDate;
	}
	
	public String getCaseNumber() 
	{
		return caseNumber;
	}
	
	public void setCaseNumber(String caseNumber) 
	{
		this.caseNumber = caseNumber;
	}
	
	public String getlName() 
	{
		return lName;
	}
	
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	
	public String getP() 
	{
		return p;
	}
	
	public void setP(String p) 
	{
		this.p = p;
	}
	
	public String getfName() 
	{
		return fName;
	}
	
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	
	public String getStateID() 
	{
		return stateID;
	}
	
	public void setStateID(String stateID) 
	{
		this.stateID = stateID;
	}
	
	public String getCertLevel() 
	{
		return certLevel;
	}
	
	public void setCertLevel(String certLevel) 
	{
		this.certLevel = certLevel;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public String getAction() 
	{
		return action;
	}
	
	public void setAction(String action) 
	{
		this.action = action;
	}
	
	public int getOffYr() 
	{
		return offYr;
	}
	
	public void setOffYr(int offYr) 
	{
		this.offYr = offYr;
	}
	
	public String getOffense() 
	{
		return offense;
	}
	
	public void setOffense(String offense) 
	{
		this.offense = offense;
	}
	
	public int getDispoYr() 
	{
		return dispoYr;
	}
	
	public void setDispoYr(int dispoYr) 
	{
		this.dispoYr = dispoYr;
	}
	
	public String getDisposition() 
	{
		return disposition;
	}
	
	public void setDisposition(String disposition) 
	{
		this.disposition = disposition;
	}
	
	public String getNote() 
	{
		return note;
	}
	
	public void setNote(String note) 
	{
		this.note = note;
	}
	
	public String getUpDate() 
	{
		return upDate;
	}
	
	public void setUpDate(String upDate) 
	{
		this.upDate = upDate;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
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
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	public String getStatus2() 
	{
		return status2;
	}
	
	public void setStatus2(String status2) 
	{
		this.status2 = status2;
	}
	
	public String getEntryBy() 
	{
		return entryBy;
	}
	
	public void setEntryBy(String entryBy) 
	{
		this.entryBy = entryBy;
	}
	
	public String getEntryDate() 
	{
		return entryDate;
	}
	
	public void setEntryDate(String entryDate) 
	{
		this.entryDate = entryDate;
	}
	
	public String getSupRec() 
	{
		return supRec;
	}
	
	public void setSupRec(String supRec) 
	{
		this.supRec = supRec;
	}
	
	public String getOldID() 
	{
		return oldID;
	}
	
	public void setOldID(String oldID) 
	{
		this.oldID = oldID;
	}
}
