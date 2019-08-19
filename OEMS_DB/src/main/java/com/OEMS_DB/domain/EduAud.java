package com.OEMS_DB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EduAud 
{

	private int ID;
	private String openDate;
	private String caseNumber;
	private String oemsStaff;
	private String courseNum;
	private String evalDate;
	private String sessNum;
	private String sessName;
	private String lecturer;
	private String location;
	private String medDir;
	private String courseDir;
	private String courseCoord;
	private String leadInst;
	private int numStudents;
	private int numInstructors;
	private int numAides;
	private String ratio;
	private String comments;
	private String eduProgVioID;
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
	
	public String getOemsStaff() 
	{
		return oemsStaff;
	}
	
	public void setOemsStaff(String oemsStaff) 
	{
		this.oemsStaff = oemsStaff;
	}
	
	public String getCourseNum() 
	{
		return courseNum;
	}
	
	public void setCourseNum(String courseNum) 
	{
		this.courseNum = courseNum;
	}
	
	public String getEvalDate() 
	{
		return evalDate;
	}
	
	public void setEvalDate(String evalDate) 
	{
		this.evalDate = evalDate;
	}
	
	public String getSessNum() 
	{
		return sessNum;
	}
	
	public void setSessNum(String sessNum) 
	{
		this.sessNum = sessNum;
	}
	
	public String getSessName() 
	{
		return sessName;
	}
	
	public void setSessName(String sessName) 
	{
		this.sessName = sessName;
	}
	
	public String getLecturer() 
	{
		return lecturer;
	}
	
	public void setLecturer(String lecturer) 
	{
		this.lecturer = lecturer;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public String getMedDir() 
	{
		return medDir;
	}
	
	public void setMedDir(String medDir) 
	{
		this.medDir = medDir;
	}
	
	public String getCourseDir() 
	{
		return courseDir;
	}
	
	public void setCourseDir(String courseDir) 
	{
		this.courseDir = courseDir;
	}
	
	public String getCourseCoord() 
	{
		return courseCoord;
	}
	
	public void setCourseCoord(String courseCoord) 
	{
		this.courseCoord = courseCoord;
	}
	
	public String getLeadInst() 
	{
		return leadInst;
	}
	
	public void setLeadInst(String leadInst) 
	{
		this.leadInst = leadInst;
	}
	
	public int getNumStudents() 
	{
		return numStudents;
	}
	
	public void setNumStudents(int numStudents) 
	{
		this.numStudents = numStudents;
	}
	
	public int getNumInstructors() 
	{
		return numInstructors;
	}
	
	public void setNumInstructors(int numInstructors) 
	{
		this.numInstructors = numInstructors;
	}
	
	public int getNumAides() 
	{
		return numAides;
	}
	
	public void setNumAides(int numAides) 
	{
		this.numAides = numAides;
	}
	
	public String getRatio() 
	{
		return ratio;
	}
	
	public void setRatio(String ratio) 
	{
		this.ratio = ratio;
	}
	
	public String getComments() 
	{
		return comments;
	}
	
	public void setComments(String comments) 
	{
		this.comments = comments;
	}

	public String getEduProgVioID() 
	{
		return eduProgVioID;
	}

	public void setEduProgVioID(String eduProgVioID) 
	{
		this.eduProgVioID = eduProgVioID;
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
