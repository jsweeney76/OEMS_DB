package com.OEMS_DB.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class edProgVio 
{
	private int ID;
	private boolean minEquip;
	private boolean equipStor;
	private boolean equipOffSite;
	private boolean ratioOK;
	private boolean lecApprop;
	private boolean skills;
	private boolean facHeatCool;
	private boolean recMaint;
	private boolean lmsRec;
	private boolean revExam;
	private boolean writSurvey;
	private boolean attRec;
	private String strengths;
	private String weaknesses;
	private String recommendations;
	private boolean meetsStandard;
	private boolean addVisitsReq;
	private boolean remPlan;
	private String staffComments;
	private boolean cpyRep;
	private boolean refresher;
	private String integrated;
	private String surveyComment;
	private String status;
	private String commRec;
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
	
	public boolean isMinEquip() 
	{
		return minEquip;
	}
	
	public void setMinEquip(boolean minEquip) 
	{
		this.minEquip = minEquip;
	}
	
	public boolean isEquipStor() 
	{
		return equipStor;
	}
	
	public void setEquipStor(boolean equipStor) 
	{
		this.equipStor = equipStor;
	}
	
	public boolean isEquipOffSite() 
	{
		return equipOffSite;
	}
	
	public void setEquipOffSite(boolean equipOffSite) 
	{
		this.equipOffSite = equipOffSite;
	}
	
	public boolean isRatioOK() 
	{
		return ratioOK;
	}
	
	public void setRatioOK(boolean ratioOK) 
	{
		this.ratioOK = ratioOK;
	}
	
	public boolean isLecApprop() 
	{
		return lecApprop;
	}
	
	public void setLecApprop(boolean lecApprop) 
	{
		this.lecApprop = lecApprop;
	}
	
	public boolean isSkills() 
	{
		return skills;
	}
	
	public void setSkills(boolean skills) 
	{
		this.skills = skills;
	}
	
	public boolean isFacHeatCool() 
	{
		return facHeatCool;
	}
	
	public void setFacHeatCool(boolean facHeatCool) 
	{
		this.facHeatCool = facHeatCool;
	}
	
	public boolean isRecMaint() 
	{
		return recMaint;
	}
	
	public void setRecMaint(boolean recMaint) 
	{
		this.recMaint = recMaint;
	}
	
	public boolean isLmsRec() 
	{
		return lmsRec;
	}
	
	public void setLmsRec(boolean lmsRec) 
	{
		this.lmsRec = lmsRec;
	}
	
	public boolean isRevExam() 
	{
		return revExam;
	}
	
	public void setRevExam(boolean revExam) 
	{
		this.revExam = revExam;
	}
	
	public boolean isWritSurvey() 
	{
		return writSurvey;
	}
	
	public void setWritSurvey(boolean writSurvey) 
	{
		this.writSurvey = writSurvey;
	}
	
	public boolean isAttRec() 
	{
		return attRec;
	}
	
	public void setAttRec(boolean attRec) 
	{
		this.attRec = attRec;
	}
	
	public String getStrengths() 
	{
		return strengths;
	}
	
	public void setStrengths(String strengths) 
	{
		this.strengths = strengths;
	}
	
	public String getWeaknesses() 
	{
		return weaknesses;
	}
	
	public void setWeaknesses(String weaknesses) 
	{
		this.weaknesses = weaknesses;
	}
	
	public String getRecommendations() 
	{
		return recommendations;
	}
	
	public void setRecommendations(String recommendations) 
	{
		this.recommendations = recommendations;
	}
	
	public boolean isMeetsStandard() 
	{
		return meetsStandard;
	}
	
	public void setMeetsStandard(boolean meetsStandard) 
	{
		this.meetsStandard = meetsStandard;
	}
	
	public boolean isAddVisitsReq() 
	{
		return addVisitsReq;
	}
	
	public void setAddVisitsReq(boolean addVisitsReq) 
	{
		this.addVisitsReq = addVisitsReq;
	}
	
	public boolean isRemPlan() 
	{
		return remPlan;
	}
	
	public void setRemPlan(boolean remPlan) 
	{
		this.remPlan = remPlan;
	}
	
	public String getStaffComments() 
	{
		return staffComments;
	}
	
	public void setStaffComments(String staffComments) 
	{
		this.staffComments = staffComments;
	}
	
	public boolean isCpyRep() 
	{
		return cpyRep;
	}
	
	public void setCpyRep(boolean cpyRep) 
	{
		this.cpyRep = cpyRep;
	}
	
	public boolean isRefresher() 
	{
		return refresher;
	}
	
	public void setRefresher(boolean refresher) 
	{
		this.refresher = refresher;
	}
	
	public String getIntegrated() 
	{
		return integrated;
	}
	
	public void setIntegrated(String integrated) 
	{
		this.integrated = integrated;
	}
	
	public String getSurveyComment() 
	{
		return surveyComment;
	}
	
	public void setSurveyComment(String surveyComment) 
	{
		this.surveyComment = surveyComment;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public String getCommRec() 
	{
		return commRec;
	}
	
	public void setCommRec(String commRec) 
	{
		this.commRec = commRec;
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
