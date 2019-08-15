package com.OEMS_DB.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Occurrence {

	private int ID;
	private String caseNum;
	private String openDate;
	private String agName;
	private String occDate;
	private String reportedDate;
	private String staffTakingReport;
	private String contactPerson;
	private String vehNum;
	private String unitType;
	private int numStaffInj;
	private int numPatientInj;
	private int numOtherInj;
	private String description;
	private String status;
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
	
	public String getCaseNum() 
	{
		return caseNum;
	}
	
	public void setCaseNum(String caseNum) 
	{
		this.caseNum = caseNum;
	}
	
	public String getOpenDate() 
	{
		return openDate;
	}
	
	public void setOpenDate(String openDate) 
	{
		this.openDate = openDate;
	}
	
	public String getAgName() 
	{
		return agName;
	}
	
	public void setAgName(String agName) 
	{
		this.agName = agName;
	}
	
	public String getOccDate() 
	{
		return occDate;
	}
	
	public void setOccDate(String occDate) 
	{
		this.occDate = occDate;
	}
	
	public String getReportedDate() 
	{
		return reportedDate;
	}
	
	public void setReportedDate(String reportedDate) 
	{
		this.reportedDate = reportedDate;
	}
	
	public String getStaffTakingReport() 
	{
		return staffTakingReport;
	}
	
	public void setStaffTakingReport(String staffTakingReport) 
	{
		this.staffTakingReport = staffTakingReport;
	}
	
	public String getContactPerson() 
	{
		return contactPerson;
	}
	
	public void setContactPerson(String contactPerson) 
	{
		this.contactPerson = contactPerson;
	}
	
	public String getVehNum() 
	{
		return vehNum;
	}
	
	public void setVehNum(String vehNum) 
	{
		this.vehNum = vehNum;
	}
	
	public String getUnitType() 
	{
		return unitType;
	}
	
	public void setUnitType(String unitType) 
	{
		this.unitType = unitType;
	}
	
	public int getNumStaffInj() 
	{
		return numStaffInj;
	}
	
	public void setNumStaffInj(int numStaffInj) 
	{
		this.numStaffInj = numStaffInj;
	}
	
	public int getNumPatientInj() 
	{
		return numPatientInj;
	}
	
	public void setNumPatientInj(int numPatientInj) 
	{
		this.numPatientInj = numPatientInj;
	}
	
	public int getNumOtherInj() 
	{
		return numOtherInj;
	}
	
	public void setNumOtherInj(int numOtherInj) 
	{
		this.numOtherInj = numOtherInj;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
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
