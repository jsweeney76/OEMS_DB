package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investigation 
{

	private int ID;
	private String openDate;
	private String caseNumber;
	private String agencyID;
	private String lName;
	private String fName;
	private String StaffAssigned;
	private String fileLocation;
	private String status;
	private String category;
	private String complainantInfo;
	private String priority;
	private String trackingNum;
	private String sentBy;
	private String sentTime;
	private String notes;
	private String PRID;
	private boolean PCR;
	private String status2;
	private String oldID;
	private int approvalID;
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
	
	public String getlName() 
	{
		return lName;
	}
	
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	
	public String getfName() 
	{
		return fName;
	}
	
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	
	public String getStaffAssigned() 
	{
		return StaffAssigned;
	}
	
	public void setStaffAssigned(String staffAssigned) 
	{
		StaffAssigned = staffAssigned;
	}
	
	public String getFileLocation() 
	{
		return fileLocation;
	}
	
	public void setFileLocation(String fileLocation) 
	{
		this.fileLocation = fileLocation;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	public String getCategory() 
	{
		return category;
	}
	
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	public String getComplainantInfo() 
	{
		return complainantInfo;
	}
	
	public void setComplainantInfo(String complainantInfo) 
	{
		this.complainantInfo = complainantInfo;
	}
	
	public String getPriority() 
	{
		return priority;
	}
	
	public void setPriority(String priority) 
	{
		this.priority = priority;
	}
	
	public String getTrackingNum() 
	{
		return trackingNum;
	}
	
	public void setTrackingNum(String trackingNum) 
	{
		this.trackingNum = trackingNum;
	}
	
	public String getSentBy() 
	{
		return sentBy;
	}
	
	public void setSentBy(String sentBy) 
	{
		this.sentBy = sentBy;
	}
	
	public String getSentTime() 
	{
		return sentTime;
	}
	
	public void setSentTime(String sentTime) 
	{
		this.sentTime = sentTime;
	}
	
	public String getNotes() 
	{
		return notes;
	}
	
	public void setNotes(String notes) 
	{
		this.notes = notes;
	}
	
	public String getPRID() 
	{
		return PRID;
	}
	
	public void setPRID(String pRID) 
	{
		PRID = pRID;
	}
	
	public boolean isPCR() 
	{
		return PCR;
	}
	
	public void setPCR(boolean pCR) 
	{
		PCR = pCR;
	}
	
	public String getStatus2() 
	{
		return status2;
	}
	
	public void setStatus2(String status2) 
	{
		this.status2 = status2;
	}
	
	public String getOldID() 
	{
		return oldID;
	}
	
	public void setOldID(String oldID) 
	{
		this.oldID = oldID;
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

	public int getApprovalID() 
	{
		return approvalID;
	}

	public void setApprovalID(int approvalID) 
	{
		this.approvalID = approvalID;
	}
}
