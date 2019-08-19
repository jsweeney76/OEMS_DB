package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accident {

	private int ID;
	private String openDate;
	private String caseNumber;
	private String agencyID;
	private String accidentDate;
	private String reportedDate;
	private String oemsStaff;
	private String contactPerson;
	private String vehNum;
	private String unitType;
	private int numStaffInj;
	private int numPatientsInj;
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
	
	public String getAgencyID() 
	{
		return agencyID;
	}
	
	public void setAgencyID(String agencyID) 
	{
		this.agencyID = agencyID;
	}
	
	public String getAccidentDate() 
	{
		return accidentDate;
	}
	
	public void setAccidentDate(String accidentDate) 
	{
		this.accidentDate = accidentDate;
	}
	
	public String getReportedDate() 
	{
		return reportedDate;
	}
	
	public void setReportedDate(String reportedDate) 
	{
		this.reportedDate = reportedDate;
	}
	
	public String getOemsStaff() 
	{
		return oemsStaff;
	}
	
	public void setOemsStaff(String oemsStaff) 
	{
		this.oemsStaff = oemsStaff;
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
	
	public int getNumPatientsInj() 
	{
		return numPatientsInj;
	}
	
	public void setNumPatientsInj(int numPatientsInj) 
	{
		this.numPatientsInj = numPatientsInj;
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
