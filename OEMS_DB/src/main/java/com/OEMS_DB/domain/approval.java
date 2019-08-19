package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class approval {

	private int ID;
	private String manager;
	private String managerRec;
	private String managerApp;
	private String chief;
	private String chiefRec;
	private String chiefApp;
	private String compliance;
	private String complianceRec;
	private String complianceApp;
	private String director;
	private String directorRec;
	private String directorApp;
	private int caseID;
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
	
	public String getManager() 
	{
		return manager;
	}
	
	public void setManager(String manager) 
	{
		this.manager = manager;
	}
	
	public String getManagerRec() 
	{
		return managerRec;
	}
	
	public void setManagerRec(String managerRec) 
	{
		this.managerRec = managerRec;
	}
	
	public String getManagerApp() 
	{
		return managerApp;
	}
	
	public void setManagerApp(String managerApp) 
	{
		this.managerApp = managerApp;
	}
	
	public String getChief() 
	{
		return chief;
	}
	
	public void setChief(String chief) 
	{
		this.chief = chief;
	}
	
	public String getChiefRec() 
	{
		return chiefRec;
	}
	
	public void setChiefRec(String chiefRec) 
	{
		this.chiefRec = chiefRec;
	}
	
	public String getChiefApp() 
	{
		return chiefApp;
	}
	
	public void setChiefApp(String chiefApp) 
	{
		this.chiefApp = chiefApp;
	}
	
	public String getCompliance() 
	{
		return compliance;
	}
	
	public void setCompliance(String compliance) 
	{
		this.compliance = compliance;
	}
	
	public String getComplianceRec() 
	{
		return complianceRec;
	}
	
	public void setComplianceRec(String complianceRec) 
	{
		this.complianceRec = complianceRec;
	}
	
	public String getComplianceApp() 
	{
		return complianceApp;
	}
	
	public void setComplianceApp(String complianceApp) 
	{
		this.complianceApp = complianceApp;
	}
	
	public String getDirector() 
	{
		return director;
	}
	
	public void setDirector(String director) 
	{
		this.director = director;
	}
	
	public String getDirectorRec() 
	{
		return directorRec;
	}
	
	public void setDirectorRec(String directorRec) 
	{
		this.directorRec = directorRec;
	}
	
	public String getDirectorApp() 
	{
		return directorApp;
	}
	
	public void setDirectorApp(String directorApp) 
	{
		this.directorApp = directorApp;
	}

	public int getCaseID() 
	{
		return caseID;
	}

	public void setCaseID(int caseID) 
	{
		this.caseID = caseID;
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
