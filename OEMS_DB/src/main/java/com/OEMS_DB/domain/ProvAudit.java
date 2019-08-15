package com.OEMS_DB.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ProvAudit {

	private int ID;
	private String openDate;
	private String caseNum;
	private String agencyID;
	private String auditLoc;
	private String auditType;
	private String auditBy;
	private String auditResult;
	private String auditNotes;
	private boolean certCur;
	private boolean vehLoc;
	private boolean liabIns;
	private boolean SOU;
	private boolean upLic;
	private boolean mainCert;
	private boolean pcrReq;
	private boolean regs;
	private boolean SOP;
	private boolean roster;
	private boolean vehInspect;
	private boolean vidSurv;
	private String clinCoord;
	private String medDir;
	private boolean mdLic;
	private boolean mdCert;
	private boolean mdExp;
	private boolean mdBoard;
	private boolean compMD;
	private boolean protMD;
	private boolean pedOMC;
	private String SCC;
	private boolean sccLic;
	private boolean sccExp;
	private String penaltyID;
	private String notes;
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
	
	public String getCaseNum() 
	{
		return caseNum;
	}
	
	public void setCaseNum(String caseNum) 
	{
		this.caseNum = caseNum;
	}
	
	public String getAgencyID() 
	{
		return agencyID;
	}
	
	public void setAgencyID(String agencyID) 
	{
		this.agencyID = agencyID;
	}
	
	public String getAuditLoc() 
	{
		return auditLoc;
	}
	
	public void setAuditLoc(String auditLoc) 
	{
		this.auditLoc = auditLoc;
	}
	
	public String getAuditType() 
	{
		return auditType;
	}
	
	public void setAuditType(String auditType) 
	{
		this.auditType = auditType;
	}
	
	public String getAuditBy() 
	{
		return auditBy;
	}
	
	public void setAuditBy(String auditBy) 
	{
		this.auditBy = auditBy;
	}
	
	public String getAuditResult() 
	{
		return auditResult;
	}
	
	public void setAuditResult(String auditResult) 
	{
		this.auditResult = auditResult;
	}
	
	public String getAuditNotes() 
	{
		return auditNotes;
	}
	
	public void setAuditNotes(String auditNotes) 
	{
		this.auditNotes = auditNotes;
	}
	
	public boolean isCertCur() 
	{
		return certCur;
	}
	
	public void setCertCur(boolean certCur) 
	{
		this.certCur = certCur;
	}
	
	public boolean isVehLoc() 
	{
		return vehLoc;
	}
	
	public void setVehLoc(boolean vehLoc) 
	{
		this.vehLoc = vehLoc;
	}
	
	public boolean isLiabIns() 
	{
		return liabIns;
	}
	
	public void setLiabIns(boolean liabIns) 
	{
		this.liabIns = liabIns;
	}
	
	public boolean isSOU() 
	{
		return SOU;
	}
	
	public void setSOU(boolean sOU) 
	{
		SOU = sOU;
	}
	
	public boolean isUpLic() 
	{
		return upLic;
	}
	
	public void setUpLic(boolean upLic) 
	{
		this.upLic = upLic;
	}
	
	public boolean isMainCert() 
	{
		return mainCert;
	}
	
	public void setMainCert(boolean mainCert) 
	{
		this.mainCert = mainCert;
	}
	
	public boolean isPcrReq() 
	{
		return pcrReq;
	}
	
	public void setPcrReq(boolean pcrReq) 
	{
		this.pcrReq = pcrReq;
	}
	
	public boolean isRegs() 
	{
		return regs;
	}
	
	public void setRegs(boolean regs) 
	{
		this.regs = regs;
	}
	
	public boolean isSOP() 
	{
		return SOP;
	}
	
	public void setSOP(boolean sOP) 
	{
		SOP = sOP;
	}
	
	public boolean isRoster() 
	{
		return roster;
	}
	
	public void setRoster(boolean roster) 
	{
		this.roster = roster;
	}
	
	public boolean isVehInspect() 
	{
		return vehInspect;
	}
	
	public void setVehInspect(boolean vehInspect) 
	{
		this.vehInspect = vehInspect;
	}
	
	public boolean isVidSurv() 
	{
		return vidSurv;
	}
	
	public void setVidSurv(boolean vidSurv) 
	{
		this.vidSurv = vidSurv;
	}
	
	public String getClinCoord() 
	{
		return clinCoord;
	}
	
	public void setClinCoord(String clinCoord) 
	{
		this.clinCoord = clinCoord;
	}
	
	public String getMedDir() 
	{
		return medDir;
	}
	
	public void setMedDir(String medDir) 
	{
		this.medDir = medDir;
	}
	public boolean isMdLic() 
	{
		return mdLic;
	}
	
	public void setMdLic(boolean mdLic) 
	{
		this.mdLic = mdLic;
	}
	
	public boolean isMdCert() 
	{
		return mdCert;
	}
	
	public void setMdCert(boolean mdCert) 
	{
		this.mdCert = mdCert;
	}
	
	public boolean isMdExp() 
	{
		return mdExp;
	}
	
	public void setMdExp(boolean mdExp) 
	{
		this.mdExp = mdExp;
	}
	
	public boolean isMdBoard() 
	{
		return mdBoard;
	}
	
	public void setMdBoard(boolean mdBoard) 
	{
		this.mdBoard = mdBoard;
	}
	
	public boolean isCompMD() 
	{
		return compMD;
	}
	
	public void setCompMD(boolean compMD) 
	{
		this.compMD = compMD;
	}
	
	public boolean isProtMD() 
	{
		return protMD;
	}
	
	public void setProtMD(boolean protMD) 
	{
		this.protMD = protMD;
	}
	
	public boolean isPedOMC() 
	{
		return pedOMC;
	}
	
	public void setPedOMC(boolean pedOMC) 
	{
		this.pedOMC = pedOMC;
	}
	
	public String getSCC() 
	{
		return SCC;
	}
	
	public void setSCC(String sCC) 
	{
		SCC = sCC;
	}
	public boolean isSccLic() 
	{
		return sccLic;
	}
	
	public void setSccLic(boolean sccLic) 
	{
		this.sccLic = sccLic;
	}
	
	public boolean isSccExp() 
	{
		return sccExp;
	}
	
	public void setSccExp(boolean sccExp) 
	{
		this.sccExp = sccExp;
	}
	
	public String getPenaltyID() 
	{
		return penaltyID;
	}
	
	public void setPenaltyID(String penaltyID) 
	{
		this.penaltyID = penaltyID;
	}
	
	public String getNotes() 
	{
		return notes;
	}
	
	public void setNotes(String notes) 
	{
		this.notes = notes;
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
