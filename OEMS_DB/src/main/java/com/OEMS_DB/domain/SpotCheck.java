package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpotCheck {

	private int ID;
	private String openDate;
	private String caseNumber;
	private int agencyID;
	private String inspectionDate;
	private String inspectedBy;
	private String inspectedBy2;
	private String inspectionLocation;
	private String city;
	private String state;
	private String recNum;
	private String VINNum;
	private String comment;
	private String actionTaken;
	private boolean DIOOS;
	private String unitType;
	private boolean photosTaken;
	private String status;
	private String oldID;
	private int violationID;
	private String entryBy;
	private String entryDate;
	
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
	
	public int getAgencyID() 
	{
		return agencyID;
	}
	
	public void setAgencyID(int agencyID) 
	{
		this.agencyID = agencyID;
	}
	
	public String getInspectionDate() 
	{
		return inspectionDate;
	}
	
	public void setInspectionDate(String inspectionDate) 
	{
		this.inspectionDate = inspectionDate;
	}
	
	public String getInspectedBy() 
	{
		return inspectedBy;
	}
	
	public void setInspectedBy(String inspectedBy) 
	{
		this.inspectedBy = inspectedBy;
	}
	
	public String getInspectedBy2() 
	{
		return inspectedBy2;
	}
	
	public void setInspectedBy2(String inspectedBy2) 
	{
		this.inspectedBy2 = inspectedBy2;
	}
	
	public String getInspectionLocation() 
	{
		return inspectionLocation;
	}
	
	public void setInspectionLocation(String inspectionLocation) 
	{
		this.inspectionLocation = inspectionLocation;
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
	
	public String getRecNum() 
	{
		return recNum;
	}
	
	public void setRecNum(String recNum) 
	{
		this.recNum = recNum;
	}
	
	public String getVINNum() 
	{
		return VINNum;
	}
	
	public void setVINNum(String vINNum) 
	{
		VINNum = vINNum;
	}
	
	public String getComment() 
	{
		return comment;
	}
	
	public void setComment(String comment) 
	{
		this.comment = comment;
	}
	
	public String getActionTaken() 
	{
		return actionTaken;
	}
	
	public void setActionTaken(String actionTaken) 
	{
		this.actionTaken = actionTaken;
	}
	
	public boolean isDIOOS() 
	{
		return DIOOS;
	}
	
	public void setDIOOS(boolean dIOOS) 
	{
		DIOOS = dIOOS;
	}
	
	public String getUnitType() 
	{
		return unitType;
	}
	
	public void setUnitType(String unitType) 
	{
		this.unitType = unitType;
	}
	
	public boolean isPhotosTaken() 
	{
		return photosTaken;
	}
	
	public void setPhotosTaken(boolean photosTaken) 
	{
		this.photosTaken = photosTaken;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public String getOldID() 
	{
		return oldID;
	}
	
	public void setOldID(String oldID) 
	{
		this.oldID = oldID;
	}
	
	public int getViolationID() 
	{
		return violationID;
	}
	
	public void setViolationID(int violationID) 
	{
		this.violationID = violationID;
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
}
